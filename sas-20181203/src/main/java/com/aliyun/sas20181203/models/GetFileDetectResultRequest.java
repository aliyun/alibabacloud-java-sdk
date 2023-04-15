// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileDetectResultRequest extends TeaModel {
    /**
     * <p>The identifiers of files. Only MD5 hash values are supported.</p>
     */
    @NameInMap("HashKeyList")
    public java.util.List<String> hashKeyList;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The type of the file. Valid values:</p>
     * <br>
     * <p>*   **0**: unknown file</p>
     * <p>*   **1**: binary file</p>
     * <p>*   **2**: webshell file</p>
     * <p>*   **4**: script file</p>
     * <br>
     * <p>> If you do not know the type of the file, set this parameter to 0.</p>
     */
    @NameInMap("Type")
    public Integer type;

    public static GetFileDetectResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFileDetectResultRequest self = new GetFileDetectResultRequest();
        return TeaModel.build(map, self);
    }

    public GetFileDetectResultRequest setHashKeyList(java.util.List<String> hashKeyList) {
        this.hashKeyList = hashKeyList;
        return this;
    }
    public java.util.List<String> getHashKeyList() {
        return this.hashKeyList;
    }

    public GetFileDetectResultRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public GetFileDetectResultRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
