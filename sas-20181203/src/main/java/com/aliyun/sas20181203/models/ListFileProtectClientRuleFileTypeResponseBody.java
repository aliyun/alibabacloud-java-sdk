// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListFileProtectClientRuleFileTypeResponseBody extends TeaModel {
    @NameInMap("FileTypes")
    public java.util.List<String> fileTypes;

    /**
     * <strong>example:</strong>
     * <p>F8B6F758-BCD4-597A-8A2C-DA5A552C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListFileProtectClientRuleFileTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFileProtectClientRuleFileTypeResponseBody self = new ListFileProtectClientRuleFileTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFileProtectClientRuleFileTypeResponseBody setFileTypes(java.util.List<String> fileTypes) {
        this.fileTypes = fileTypes;
        return this;
    }
    public java.util.List<String> getFileTypes() {
        return this.fileTypes;
    }

    public ListFileProtectClientRuleFileTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
