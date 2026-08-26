// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIMediaAuditJobRequest extends TeaModel {
    @NameInMap("CensorProvider")
    public String censorProvider;

    /**
     * <p>The configuration of the review job.</p>
     * <ul>
     * <li>For other configuration items of the review job, only the ResourceType field is currently supported. This field controls the media file type, and you can adjust the review standards and rules for the specified type.</li>
     * <li>To adjust the review standards and rules for a ResourceType, submit a ticket for technical support. For information about how to submit a ticket, refer to <a href="https://help.aliyun.com/document_detail/464625.html">Contact us</a>.</li>
     * <li>Usage notes for ResourceType: Only letters, digits, and underscores (_) are allowed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ResourceType&quot;:&quot;****_movie&quot;}</p>
     */
    @NameInMap("MediaAuditConfiguration")
    public String mediaAuditConfiguration;

    /**
     * <p>The audio or video ID. Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Review Management</strong> &gt; <strong>Video Review</strong> to view the audio or video ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fe028d09441afffb138cd7ee****</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The media type. Currently, only <strong>video</strong> is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    @NameInMap("ServiceParameters")
    public String serviceParameters;

    /**
     * <p>The AI template ID. You can obtain the ID by using one of the following methods:</p>
     * <ul>
     * <li>When you call the <a href="https://help.aliyun.com/document_detail/102930.html">AddAITemplate</a> operation to add an AI template, the AI template ID is the value of the TemplateId response parameter.</li>
     * <li>After the AI template is added, call the <a href="https://help.aliyun.com/document_detail/102936.html">ListAITemplate</a> operation to query the AI template ID, which is the value of the TemplateId response parameter.</li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify an AI template ID, the default AI template ID for automated review is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a07a7f7d7d10eb9fd999e56ecc****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The custom settings. The value is a JSON string that supports settings such as message callbacks. For more information, refer to <a href="https://help.aliyun.com/document_detail/86952.html">UserData</a>.</p>
     * <blockquote>
     * <p>To use message callbacks in this parameter, you must configure an HTTP callback URL and select the corresponding callback event types in the console. Otherwise, the callback settings do not take effect. For information about how to configure HTTP callbacks in the console, refer to <a href="https://help.aliyun.com/document_detail/86071.html">Callback settings</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;MessageCallback&quot;:{&quot;CallbackURL&quot;:&quot;<a href="http://test.test.com%22%7D,%22Extend%22:%7B%22localId%22:%22xxx%22,%22test%22:%22www%22%7D%7D">http://test.test.com&quot;},&quot;Extend&quot;:{&quot;localId&quot;:&quot;xxx&quot;,&quot;test&quot;:&quot;www&quot;}}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    @NameInMap("VideoService")
    public String videoService;

    @NameInMap("VoiceService")
    public String voiceService;

    public static SubmitAIMediaAuditJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIMediaAuditJobRequest self = new SubmitAIMediaAuditJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAIMediaAuditJobRequest setCensorProvider(String censorProvider) {
        this.censorProvider = censorProvider;
        return this;
    }
    public String getCensorProvider() {
        return this.censorProvider;
    }

    public SubmitAIMediaAuditJobRequest setMediaAuditConfiguration(String mediaAuditConfiguration) {
        this.mediaAuditConfiguration = mediaAuditConfiguration;
        return this;
    }
    public String getMediaAuditConfiguration() {
        return this.mediaAuditConfiguration;
    }

    public SubmitAIMediaAuditJobRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public SubmitAIMediaAuditJobRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public SubmitAIMediaAuditJobRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

    public SubmitAIMediaAuditJobRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public SubmitAIMediaAuditJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public SubmitAIMediaAuditJobRequest setVideoService(String videoService) {
        this.videoService = videoService;
        return this;
    }
    public String getVideoService() {
        return this.videoService;
    }

    public SubmitAIMediaAuditJobRequest setVoiceService(String voiceService) {
        this.voiceService = voiceService;
        return this;
    }
    public String getVoiceService() {
        return this.voiceService;
    }

}
