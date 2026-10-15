// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ReportChannelPublishResultRequest extends TeaModel {
    /**
     * <p>The display name of the publishing account. A null value does not overwrite the original value. Maximum length: 256 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("ChannelAccountName")
    public String channelAccountName;

    /**
     * <p>The channel draft ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>draft-789</p>
     */
    @NameInMap("DraftId")
    public String draftId;

    /**
     * <p>The ID returned by the platform. Set this parameter when the publishing is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>5467410713875420090</p>
     */
    @NameInMap("ExternalId")
    public String externalId;

    /**
     * <p>The redirect URL of the platform.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://hf-groot.lingostarcdn.com/sparkenglish-sv/groot-parent/1-698a94b7-133b20ab-42ae793d40f6/05a0caf1-abb0-415d-941c-eecf0b613eae.mp4">https://hf-groot.lingostarcdn.com/sparkenglish-sv/groot-parent/1-698a94b7-133b20ab-42ae793d40f6/05a0caf1-abb0-415d-941c-eecf0b613eae.mp4</a></p>
     */
    @NameInMap("ExternalUrl")
    public String externalUrl;

    /**
     * <p>The failure reason. Set this parameter when the publishing fails.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("FailReason")
    public String failReason;

    /**
     * <p>Specifies whether the publishing is successful (true/false).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ReportChannelPublishResultRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportChannelPublishResultRequest self = new ReportChannelPublishResultRequest();
        return TeaModel.build(map, self);
    }

    public ReportChannelPublishResultRequest setChannelAccountName(String channelAccountName) {
        this.channelAccountName = channelAccountName;
        return this;
    }
    public String getChannelAccountName() {
        return this.channelAccountName;
    }

    public ReportChannelPublishResultRequest setDraftId(String draftId) {
        this.draftId = draftId;
        return this;
    }
    public String getDraftId() {
        return this.draftId;
    }

    public ReportChannelPublishResultRequest setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

    public ReportChannelPublishResultRequest setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
        return this;
    }
    public String getExternalUrl() {
        return this.externalUrl;
    }

    public ReportChannelPublishResultRequest setFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }
    public String getFailReason() {
        return this.failReason;
    }

    public ReportChannelPublishResultRequest setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
