// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIImageJobRequest extends TeaModel {
    /**
     * <p>The AI task pipeline ID.</p>
     * <blockquote>
     * <p>A default ID is available, so this parameter is optional. If you need to perform batch imports, use a separate task pipeline. Submit a ticket to request configuration or contact Alibaba Cloud after-sales support for configuration. For more information about how to submit a ticket, see <a href="https://help.aliyun.com/document_detail/464625.html">Contact us</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>6492025b8f*****6ba5bb755a33438</p>
     */
    @NameInMap("AIPipelineId")
    public String AIPipelineId;

    /**
     * <p>The AI image template ID. You can obtain the template ID by using one of the following methods:</p>
     * <ul>
     * <li>When you create an image template by calling the <a href="https://help.aliyun.com/document_detail/102930.html">AddAITemplate</a> operation, the template ID is the value of the TemplateId parameter in the response.</li>
     * <li>After the template is created, you can call the <a href="https://help.aliyun.com/document_detail/102936.html">ListAITemplate</a> operation to query the AI image template ID, which is the value of the TemplateId parameter in the response.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ef1a8842cb9f*****cea80cad902e416</p>
     */
    @NameInMap("AITemplateId")
    public String AITemplateId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    /**
     * <p>The custom settings.</p>
     * <ul>
     * <li>The value must be a JSON string.</li>
     * <li>The value must contain the MessageCallback or Extend parameter.</li>
     * <li>The maximum length is 512 bytes.</li>
     * </ul>
     * <p>For more information about the parameter structure, see <a href="https://help.aliyun.com/document_detail/86952.html">UserData</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Extend&quot;:{&quot;localId&quot;:&quot;****&quot;,&quot;test&quot;:&quot;www&quot;}}</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The video ID. You can obtain the video ID by using one of the following methods:</p>
     * <ul>
     * <li>For videos uploaded through the console, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong> to view the video ID.</li>
     * <li>When you upload a video by calling the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation, the video ID is the value of the VideoId parameter in the response.</li>
     * <li>After the video is uploaded, you can call the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation to query the video ID, which is the value of the VideoId parameter in the response.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>357a8748c5774*****89d2726e6436aa</p>
     */
    @NameInMap("VideoId")
    public String videoId;

    public static SubmitAIImageJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIImageJobRequest self = new SubmitAIImageJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAIImageJobRequest setAIPipelineId(String AIPipelineId) {
        this.AIPipelineId = AIPipelineId;
        return this;
    }
    public String getAIPipelineId() {
        return this.AIPipelineId;
    }

    public SubmitAIImageJobRequest setAITemplateId(String AITemplateId) {
        this.AITemplateId = AITemplateId;
        return this;
    }
    public String getAITemplateId() {
        return this.AITemplateId;
    }

    public SubmitAIImageJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SubmitAIImageJobRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public SubmitAIImageJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitAIImageJobRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitAIImageJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public SubmitAIImageJobRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
