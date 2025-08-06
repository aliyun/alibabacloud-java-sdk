// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteTranscodeTemplatesRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TranscodeTemplateGroupId")
    public String transcodeTemplateGroupId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TranscodeTemplateIdList")
    public String transcodeTemplateIdList;

    public static DeleteTranscodeTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTranscodeTemplatesRequest self = new DeleteTranscodeTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTranscodeTemplatesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteTranscodeTemplatesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteTranscodeTemplatesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteTranscodeTemplatesRequest setTranscodeTemplateGroupId(String transcodeTemplateGroupId) {
        this.transcodeTemplateGroupId = transcodeTemplateGroupId;
        return this;
    }
    public String getTranscodeTemplateGroupId() {
        return this.transcodeTemplateGroupId;
    }

    public DeleteTranscodeTemplatesRequest setTranscodeTemplateIdList(String transcodeTemplateIdList) {
        this.transcodeTemplateIdList = transcodeTemplateIdList;
        return this;
    }
    public String getTranscodeTemplateIdList() {
        return this.transcodeTemplateIdList;
    }

}
