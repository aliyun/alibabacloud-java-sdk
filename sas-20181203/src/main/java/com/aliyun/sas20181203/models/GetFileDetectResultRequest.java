// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileDetectResultRequest extends TeaModel {
    // An array that consists of the identifiers of files. Only MD5 hash values are supported.
    @NameInMap("HashKeyList")
    public java.util.List<String> hashKeyList;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The type of the file. Valid values:
    // 
    // *   **0**: unknown file
    // *   **1**: binary file
    // *   **2**: webshell file
    // *   **4**: script file
    // 
    // >  If you do not know the type of the file, set this parameter to 0.
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
