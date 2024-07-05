// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIMediaAuditJobRequest extends TeaModel {
    /**
     * <p>The configuration information about the review job.</p>
     * <ul>
     * <li>Other configuration items of the review job. Only the ResourceType field is supported. This field is used to specify the type of media files. You can adjust review standards and rules based on the type of media files.</li>
     * <li>If you want to modify the review standard and rules based on ResourceType, <a href="https://yida.alibaba-inc.com/o/ticketapply">submit a request on Yida</a> to reach technical support.</li>
     * <li>The value of ResourceType can contain only letters, digits, and underscores (_).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ResourceType&quot;:&quot;****_movie&quot;}</p>
     */
    @NameInMap("MediaAuditConfiguration")
    public String mediaAuditConfiguration;

    /**
     * <p>The ID of the video file. To obtain the file ID, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Review Management</strong> &gt; <strong>Content Moderation</strong> in the left-side navigation pane.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fe028d09441afffb138cd7ee****</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The type of the media file. Only <strong>video</strong> is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    /**
     * <p>The ID of the AI template. You can use one of the following methods to obtain the ID of the AI template:</p>
     * <ul>
     * <li>Obtain the ID of the AI template from the response to the <a href="https://help.aliyun.com/document_detail/102930.html">AddAITemplate</a> operation. The value of TemplateId is the ID of the AI template.</li>
     * <li>Obtain the ID of the AI template from the response to the <a href="https://help.aliyun.com/document_detail/102936.html">ListAITemplate</a> operation. The value of TemplateId is the ID of the AI template.</li>
     * </ul>
     * <blockquote>
     * <p> If you do not specify an ID, the ID of the default AI template is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a07a7f7d7d10eb9fd999e56ecc****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The custom settings. The value must be a JSON string. You can configure settings such as message callbacks. For more information, see <a href="https://help.aliyun.com/document_detail/86952.html">UserData</a>.</p>
     * <blockquote>
     * <p> To use the callback configurations specified by this parameter, you must configure an HTTP callback URL and specify the types of the callback events in the ApsaraVideo VOD console. Otherwise, the callback configurations do not take effect. For more information about how to configure HTTP callback settings in the ApsaraVideo VOD console, see <a href="https://help.aliyun.com/document_detail/86071.html">Configure callback settings</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;MessageCallback&quot;:{&quot;CallbackURL&quot;:&quot;<a href="http://test.test.com%22%7D,%22Extend%22:%7B%22localId%22:%22xxx%22,%22test%22:%22www%22%7D%7D">http://test.test.com&quot;},&quot;Extend&quot;:{&quot;localId&quot;:&quot;xxx&quot;,&quot;test&quot;:&quot;www&quot;}}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitAIMediaAuditJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIMediaAuditJobRequest self = new SubmitAIMediaAuditJobRequest();
        return TeaModel.build(map, self);
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

}
