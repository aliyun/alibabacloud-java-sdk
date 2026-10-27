// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GenerateDynamicDictResponseBody extends TeaModel {
    /**
     * <p>The custom weak passwords.</p>
     */
    @NameInMap("KeywordList")
    public java.util.List<String> keywordList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>00E9B912-6066-5E4E-9F24-35EA09F2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GenerateDynamicDictResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateDynamicDictResponseBody self = new GenerateDynamicDictResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateDynamicDictResponseBody setKeywordList(java.util.List<String> keywordList) {
        this.keywordList = keywordList;
        return this;
    }
    public java.util.List<String> getKeywordList() {
        return this.keywordList;
    }

    public GenerateDynamicDictResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
