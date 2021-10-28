// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class FindRiskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public FindRiskResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static FindRiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindRiskResponseBody self = new FindRiskResponseBody();
        return TeaModel.build(map, self);
    }

    public FindRiskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FindRiskResponseBody setData(FindRiskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FindRiskResponseBodyData getData() {
        return this.data;
    }

    public FindRiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class FindRiskResponseBodyDataValidatorsValidator extends TeaModel {
        @NameInMap("VerifyDetail")
        public String verifyDetail;

        @NameInMap("VerifyType")
        public String verifyType;

        public static FindRiskResponseBodyDataValidatorsValidator build(java.util.Map<String, ?> map) throws Exception {
            FindRiskResponseBodyDataValidatorsValidator self = new FindRiskResponseBodyDataValidatorsValidator();
            return TeaModel.build(map, self);
        }

        public FindRiskResponseBodyDataValidatorsValidator setVerifyDetail(String verifyDetail) {
            this.verifyDetail = verifyDetail;
            return this;
        }
        public String getVerifyDetail() {
            return this.verifyDetail;
        }

        public FindRiskResponseBodyDataValidatorsValidator setVerifyType(String verifyType) {
            this.verifyType = verifyType;
            return this;
        }
        public String getVerifyType() {
            return this.verifyType;
        }

    }

    public static class FindRiskResponseBodyDataValidators extends TeaModel {
        @NameInMap("Validator")
        public java.util.List<FindRiskResponseBodyDataValidatorsValidator> validator;

        public static FindRiskResponseBodyDataValidators build(java.util.Map<String, ?> map) throws Exception {
            FindRiskResponseBodyDataValidators self = new FindRiskResponseBodyDataValidators();
            return TeaModel.build(map, self);
        }

        public FindRiskResponseBodyDataValidators setValidator(java.util.List<FindRiskResponseBodyDataValidatorsValidator> validator) {
            this.validator = validator;
            return this;
        }
        public java.util.List<FindRiskResponseBodyDataValidatorsValidator> getValidator() {
            return this.validator;
        }

    }

    public static class FindRiskResponseBodyData extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("AliyunIdkp")
        public String aliyunIdkp;

        @NameInMap("CodeType")
        public String codeType;

        @NameInMap("Extend")
        public java.util.Map<String, ?> extend;

        @NameInMap("Message")
        public String message;

        @NameInMap("NoRisk")
        public Boolean noRisk;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("Validators")
        public FindRiskResponseBodyDataValidators validators;

        @NameInMap("VerifyDetail")
        public String verifyDetail;

        @NameInMap("VerifyType")
        public String verifyType;

        @NameInMap("VerifyURL")
        public String verifyURL;

        public static FindRiskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FindRiskResponseBodyData self = new FindRiskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FindRiskResponseBodyData setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public FindRiskResponseBodyData setAliyunIdkp(String aliyunIdkp) {
            this.aliyunIdkp = aliyunIdkp;
            return this;
        }
        public String getAliyunIdkp() {
            return this.aliyunIdkp;
        }

        public FindRiskResponseBodyData setCodeType(String codeType) {
            this.codeType = codeType;
            return this;
        }
        public String getCodeType() {
            return this.codeType;
        }

        public FindRiskResponseBodyData setExtend(java.util.Map<String, ?> extend) {
            this.extend = extend;
            return this;
        }
        public java.util.Map<String, ?> getExtend() {
            return this.extend;
        }

        public FindRiskResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public FindRiskResponseBodyData setNoRisk(Boolean noRisk) {
            this.noRisk = noRisk;
            return this;
        }
        public Boolean getNoRisk() {
            return this.noRisk;
        }

        public FindRiskResponseBodyData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public FindRiskResponseBodyData setValidators(FindRiskResponseBodyDataValidators validators) {
            this.validators = validators;
            return this;
        }
        public FindRiskResponseBodyDataValidators getValidators() {
            return this.validators;
        }

        public FindRiskResponseBodyData setVerifyDetail(String verifyDetail) {
            this.verifyDetail = verifyDetail;
            return this;
        }
        public String getVerifyDetail() {
            return this.verifyDetail;
        }

        public FindRiskResponseBodyData setVerifyType(String verifyType) {
            this.verifyType = verifyType;
            return this;
        }
        public String getVerifyType() {
            return this.verifyType;
        }

        public FindRiskResponseBodyData setVerifyURL(String verifyURL) {
            this.verifyURL = verifyURL;
            return this;
        }
        public String getVerifyURL() {
            return this.verifyURL;
        }

    }

}
