// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeCustVariableConfigListResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return object</p>
     */
    @NameInMap("resultObject")
    public java.util.List<DescribeCustVariableConfigListResponseBodyResultObject> resultObject;

    public static DescribeCustVariableConfigListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustVariableConfigListResponseBody self = new DescribeCustVariableConfigListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustVariableConfigListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustVariableConfigListResponseBody setResultObject(java.util.List<DescribeCustVariableConfigListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeCustVariableConfigListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public static class DescribeCustVariableConfigListResponseBodyResultObject extends TeaModel {
        /**
         * <p>Configuration key</p>
         * 
         * <strong>example:</strong>
         * <p>COUNT</p>
         */
        @NameInMap("configKey")
        public String configKey;

        /**
         * <p>Configuration value</p>
         * 
         * <strong>example:</strong>
         * <p>累计</p>
         */
        @NameInMap("configValue")
        public String configValue;

        public static DescribeCustVariableConfigListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustVariableConfigListResponseBodyResultObject self = new DescribeCustVariableConfigListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeCustVariableConfigListResponseBodyResultObject setConfigKey(String configKey) {
            this.configKey = configKey;
            return this;
        }
        public String getConfigKey() {
            return this.configKey;
        }

        public DescribeCustVariableConfigListResponseBodyResultObject setConfigValue(String configValue) {
            this.configValue = configValue;
            return this;
        }
        public String getConfigValue() {
            return this.configValue;
        }

    }

}
