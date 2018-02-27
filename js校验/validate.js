$.extend({
	//string
	isString:function(o){
		return Object.prototype.toString.call(o).slice(8, -1) === 'String';
	},
	//number
	isNumber:function(o){
		return Object.prototype.toString.call(o).slice(8, -1) === 'Number';
	},
	//boolean
	isBoolean:function(o){
		return Object.prototype.toString.call(o).slice(8, -1) === 'Boolean';
	},
	//function
	isFunction:function(o){
		return Object.prototype.toString.call(o).slice(8, -1) === 'Function';
	},
	//null
	isNull:function(o){
		return Object.prototype.toString.call(o).slice(8, -1) === 'Null';
	},
	//undefined
	isUndefined:function(o){
		return Object.prototype.toString.call(o).slice(8, -1) === 'Undefined';
	},
	//object
	isObj:function(o){
		return Object.prototype.toString.call(o).slice(8, -1) === 'Object';
	},
	//array
	isArray:function(o){
		return Object.prototype.toString.call(o).slice(8, -1) === 'Array';
	},
	//date
	isDate:function(o){
		return Object.prototype.toString.call(o).slice(8, -1) === 'Date';
	},
	//regexp
	isRegExp:function(o){
		return Object.prototype.toString.call(o).slice(8, -1) === 'RegExp';
	},
	//error
	isError:function(o){
		return Object.prototype.toString.call(o).slice(8, -1) === 'Error';
	},
	//Symbol
	isSymbol:function(o){
		return Object.prototype.toString.call(o).slice(8, -1) === 'Symbol';
	},
	//Promise
	isPromise:function(o){
		return Object.prototype.toString.call(o).slice(8, -1) === 'Promise';
	},
	//Set
	isSet:function(o){
		return Object.prototype.toString.call(o).slice(8, -1) === 'Set';
	},
	//false
	isFalse:function(o){
		if(!o||o==='null'|| o==='undefined' || o==='false'|| o==='NaN') return true;
		return false;
	},
	//true
	isTrue:function(o){
		return !isFalse(o);
	},
  //Ios
	isIos:function(){
	    var u = navigator.userAgent;
	    if (u.indexOf('Android') > -1 || u.indexOf('Linux') > -1) {//��׿�ֻ�
	        // return "Android";
	        return false
	    } else if (u.indexOf('iPhone') > -1) {//ƻ���ֻ�
	        // return "iPhone";
	        return true
	    } else if (u.indexOf('iPad') > -1) {//iPad
	        // return "iPad";
	        return false
	    } else if (u.indexOf('Windows Phone') > -1) {//winphone�ֻ�
	        // return "Windows Phone";
	        return false
	    }else{
	        return false
	    }
	 },
	 //pc
	 isPC:function() { //�Ƿ�ΪPC��
	    var userAgentInfo = navigator.userAgent;
	    var Agents = ["Android", "iPhone",
	                "SymbianOS", "Windows Phone",
	                "iPad", "iPod"];
	    var flag = true;
	    for (var v = 0; v < Agents.length; v++) {
	        if (userAgentInfo.indexOf(Agents[v]) > 0) {
	            flag = false;
	            break;
	        }
	    }
	    return flag;
	 },
	 //browserType
	 browserType:function(){
	    var userAgent = navigator.userAgent; //ȡ���������userAgent�ַ���
	    var isOpera = userAgent.indexOf("Opera") > -1; //�ж��Ƿ�Opera�����
	    var isIE = userAgent.indexOf("compatible") > -1 && userAgent.indexOf("MSIE") > -1 && !isOpera; //�ж��Ƿ�IE�����
	    var isIE11 = userAgent.indexOf('Trident') > -1 && userAgent.indexOf("rv:11.0") > -1;
	    var isEdge = userAgent.indexOf("Edge") > -1 && !isIE; //�ж��Ƿ�IE��Edge�����  
	    var isFF = userAgent.indexOf("Firefox") > -1; //�ж��Ƿ�Firefox�����
	    var isSafari = userAgent.indexOf("Safari") > -1 && userAgent.indexOf("Chrome") == -1; //�ж��Ƿ�Safari�����
	    var isChrome = userAgent.indexOf("Chrome") > -1 && userAgent.indexOf("Safari") > -1; //�ж�Chrome�����

	    if (isIE) {
	        var reIE = new RegExp("MSIE (\\d+\\.\\d+);");
	        reIE.test(userAgent);
	        var fIEVersion = parseFloat(RegExp["$1"]);
	        if(fIEVersion == 7) return "IE7"
	        else if(fIEVersion == 8) return "IE8";
	        else if(fIEVersion == 9) return "IE9";
	        else if(fIEVersion == 10) return "IE10";
	        else return "IE7����"//IE�汾����
	    }
	    if (isIE11) return 'IE11';
	    if (isEdge) return "Edge";
	    if (isFF) return "FF";
	    if (isOpera) return "Opera";
	    if (isSafari) return "Safari";
	    if (isChrome) return "Chrome";
	 },
	 //checkstr
	 checkStr:function(str, type) {
	    switch (type) {
	        case 'phone':   //�ֻ�����
	            return /^1[3|4|5|6|7|8|9][0-9]{9}$/.test(str);
	        case 'tel':     //����
	            return /^(0\d{2,3}-\d{7,8})(-\d{1,4})?$/.test(str);
	        case 'card':    //���֤
	            return /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/.test(str);
	        case 'pwd':     //��������ĸ��ͷ��������6~18֮�䣬ֻ�ܰ�����ĸ�����ֺ��»���
	            return /^[a-zA-Z]\w{5,17}$/.test(str)
	        case 'postal':  //��������
	            return /[1-9]\d{5}(?!\d)/.test(str);
	        case 'QQ':      //QQ��
	            return /^[1-9][0-9]{4,9}$/.test(str);
	        case 'email':   //����
	            return /^[\w-]+(\.[\w-]+)*@[\w-]+(\.[\w-]+)+$/.test(str);
	        case 'money':   //���(С����2λ)
	            return /^\d*(?:\.\d{0,2})?$/.test(str);
	        case 'URL':     //��ַ
	            return /(http|ftp|https):\/\/[\w\-_]+(\.[\w\-_]+)+([\w\-\.,@?^=%&:/~\+#]*[\w\-\@?^=%&/~\+#])?/.test(str)
	        case 'IP':      //IP
	            return /((?:(?:25[0-5]|2[0-4]\\d|[01]?\\d?\\d)\\.){3}(?:25[0-5]|2[0-4]\\d|[01]?\\d?\\d))/.test(str);
	        case 'date':    //����ʱ��
	            return /^(\d{4})\-(\d{2})\-(\d{2}) (\d{2})(?:\:\d{2}|:(\d{2}):(\d{2}))$/.test(str) || /^(\d{4})\-(\d{2})\-(\d{2})$/.test(str)
	        case 'number':  //����
	            return /^[0-9]$/.test(str);
	        case 'english': //Ӣ��
	            return /^[a-zA-Z]+$/.test(str);
	        case 'chinese': //����
	            return /^[\u4E00-\u9FA5]+$/.test(str);
	        case 'lower':   //Сд
	            return /^[a-z]+$/.test(str);
	        case 'upper':   //��д
	            return /^[A-Z]+$/.test(str);
	        case 'HTML':    //HTML���
	            return /<("[^"]*"|'[^']*'|[^'">])*>/.test(str);
	        default:
	            return true;
	    	}
	 	},
	  // �ϸ�����֤У��
    isCardID:function(sId) {
        if (!/(^\d{15}$)|(^\d{17}(\d|X|x)$)/.test(sId)) {
            alert('����������֤���Ȼ��ʽ����')
            return false
        }
        //���֤����
        var aCity={11:"����",12:"���",13:"�ӱ�",14:"ɽ��",15:"���ɹ�",21:"����",22:"����",23:"������",31:"�Ϻ�",32:"����",33:"�㽭",34:"����",35:"����",36:"����",37:"ɽ��",41:"����",42:"����",43:"����",44:"�㶫",45:"����",46:"����",50:"����",51:"�Ĵ�",52:"����",53:"����",54:"����",61:"����",62:"����",63:"�ຣ",64:"����",65:"�½�",71:"̨��",81:"���",82:"����",91:"����"};
        if(!aCity[parseInt(sId.substr(0,2))]) { 
            alert('������֤�����Ƿ�')
            return false
        }

        // ����������֤
        var sBirthday=(sId.substr(6,4)+"-"+Number(sId.substr(10,2))+"-"+Number(sId.substr(12,2))).replace(/-/g,"/"),
            d = new Date(sBirthday)
        if(sBirthday != (d.getFullYear()+"/"+ (d.getMonth()+1) + "/" + d.getDate())) {
            alert('���֤�ϵĳ������ڷǷ�')
            return false
        }

        // ���֤����У��
        var sum = 0,
            weights =  [7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2],
            codes = "10X98765432"
        for (var i = 0; i < sId.length - 1; i++) {
            sum += sId[i] * weights[i];
        }
        var last = codes[sum % 11]; //������������һλ���֤����
        if (sId[sId.length-1] != last) { 
            alert('����������֤�ŷǷ�')
            return false
        }
        
        return true
    }
})
/*
(function($){
	$.fn.
})(jQuery)*/