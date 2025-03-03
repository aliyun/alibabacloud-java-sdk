// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListControlPolicyAttachmentsForTargetRequest extends TeaModel {
    /**
     * <p>The language in which you want to return the descriptions of the access control policies. Valid values:</p>
     * <ul>
     * <li>zh-CN (default value): Chinese</li>
     * <li>en: English</li>
     * <li>ja: Japanese</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is valid only for system access control policies.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The ID of the object whose access control policies you want to query. Access control policies can be attached to the following objects:</p>
     * <ul>
     * <li>Root folder</li>
     * <li>Subfolders of the Root folder</li>
     * <li>Members</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fd-ZDNPiT****</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    public static ListControlPolicyAttachmentsForTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        ListControlPolicyAttachmentsForTargetRequest self = new ListControlPolicyAttachmentsForTargetRequest();
        return TeaModel.build(map, self);
    }

    public ListControlPolicyAttachmentsForTargetRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListControlPolicyAttachmentsForTargetRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

}
