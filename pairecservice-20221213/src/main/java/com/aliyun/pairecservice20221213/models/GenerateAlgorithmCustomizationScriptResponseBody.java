// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GenerateAlgorithmCustomizationScriptResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("LogId")
    public String logId;

    /**
     * <strong>example:</strong>
     * <p>oss:xxxx</p>
     */
    @NameInMap("OssAddress")
    public String ossAddress;

    /**
     * <strong>example:</strong>
     * <p>6CF1E160-3F36-5E73-A170-C75504F05BBC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GenerateAlgorithmCustomizationScriptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateAlgorithmCustomizationScriptResponseBody self = new GenerateAlgorithmCustomizationScriptResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateAlgorithmCustomizationScriptResponseBody setLogId(String logId) {
        this.logId = logId;
        return this;
    }
    public String getLogId() {
        return this.logId;
    }

    public GenerateAlgorithmCustomizationScriptResponseBody setOssAddress(String ossAddress) {
        this.ossAddress = ossAddress;
        return this;
    }
    public String getOssAddress() {
        return this.ossAddress;
    }

    public GenerateAlgorithmCustomizationScriptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
