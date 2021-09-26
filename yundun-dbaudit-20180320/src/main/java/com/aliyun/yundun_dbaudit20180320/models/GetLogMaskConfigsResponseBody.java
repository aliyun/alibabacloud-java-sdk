// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetLogMaskConfigsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Configs")
    public java.util.List<GetLogMaskConfigsResponseBodyConfigs> configs;

    public static GetLogMaskConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLogMaskConfigsResponseBody self = new GetLogMaskConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLogMaskConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLogMaskConfigsResponseBody setConfigs(java.util.List<GetLogMaskConfigsResponseBodyConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<GetLogMaskConfigsResponseBodyConfigs> getConfigs() {
        return this.configs;
    }

    public static class GetLogMaskConfigsResponseBodyConfigs extends TeaModel {
        @NameInMap("MaskDescription")
        public String maskDescription;

        @NameInMap("MaskState")
        public Integer maskState;

        @NameInMap("MaskName")
        public String maskName;

        @NameInMap("MaskRegex")
        public String maskRegex;

        @NameInMap("MaskTxt")
        public String maskTxt;

        @NameInMap("MaskId")
        public Integer maskId;

        @NameInMap("MaskType")
        public Integer maskType;

        public static GetLogMaskConfigsResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetLogMaskConfigsResponseBodyConfigs self = new GetLogMaskConfigsResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public GetLogMaskConfigsResponseBodyConfigs setMaskDescription(String maskDescription) {
            this.maskDescription = maskDescription;
            return this;
        }
        public String getMaskDescription() {
            return this.maskDescription;
        }

        public GetLogMaskConfigsResponseBodyConfigs setMaskState(Integer maskState) {
            this.maskState = maskState;
            return this;
        }
        public Integer getMaskState() {
            return this.maskState;
        }

        public GetLogMaskConfigsResponseBodyConfigs setMaskName(String maskName) {
            this.maskName = maskName;
            return this;
        }
        public String getMaskName() {
            return this.maskName;
        }

        public GetLogMaskConfigsResponseBodyConfigs setMaskRegex(String maskRegex) {
            this.maskRegex = maskRegex;
            return this;
        }
        public String getMaskRegex() {
            return this.maskRegex;
        }

        public GetLogMaskConfigsResponseBodyConfigs setMaskTxt(String maskTxt) {
            this.maskTxt = maskTxt;
            return this;
        }
        public String getMaskTxt() {
            return this.maskTxt;
        }

        public GetLogMaskConfigsResponseBodyConfigs setMaskId(Integer maskId) {
            this.maskId = maskId;
            return this;
        }
        public Integer getMaskId() {
            return this.maskId;
        }

        public GetLogMaskConfigsResponseBodyConfigs setMaskType(Integer maskType) {
            this.maskType = maskType;
            return this;
        }
        public Integer getMaskType() {
            return this.maskType;
        }

    }

}
