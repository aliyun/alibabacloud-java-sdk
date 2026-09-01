// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileDetectResultRequest extends TeaModel {
    /**
     * <p>The list of file identifiers. A maximum of 100 elements can be specified.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("HashKeyList")
    public java.util.List<String> hashKeyList;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>183.46.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The type of file to detect. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: malicious file detection</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
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
