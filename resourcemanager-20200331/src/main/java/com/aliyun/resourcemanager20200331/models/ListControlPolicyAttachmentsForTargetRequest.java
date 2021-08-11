// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListControlPolicyAttachmentsForTargetRequest extends TeaModel {
    @NameInMap("TargetId")
    public String targetId;

    @NameInMap("Language")
    public String language;

    public static ListControlPolicyAttachmentsForTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        ListControlPolicyAttachmentsForTargetRequest self = new ListControlPolicyAttachmentsForTargetRequest();
        return TeaModel.build(map, self);
    }

    public ListControlPolicyAttachmentsForTargetRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public ListControlPolicyAttachmentsForTargetRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

}
