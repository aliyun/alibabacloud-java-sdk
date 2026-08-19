// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UploadMediaByURLRequest extends TeaModel {
    /**
     * <p>The application ID. Default value: <strong>app-1000000</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Multi-application</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>app-****</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("EnableFirstFrameCover")
    public Boolean enableFirstFrameCover;

    @NameInMap("GenerateThumbnail")
    public Boolean generateThumbnail;

    /**
     * <p>The custom deduplication identifier. If this parameter is specified and a request with the same identifier was sent within the past 10 minutes, an error is returned for the current request.</p>
     * <blockquote>
     * <ul>
     * <li>This deduplication identifier is custom-defined. It can be up to 50 characters in length and can contain uppercase and lowercase letters, digits, hyphens (-), and underscores (_). If this parameter is not specified or is set to an empty string, deduplication is not performed.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5c62d40299034bbaa4c195da330****</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The storage address of the media file.</p>
     * <p>Log on to the <a href="https://vod.console.aliyun.com/?spm=a2c4g.11186623.2.15.6948257eaZ4m54#/vod/settings/censored">ApsaraVideo VOD console</a> and choose <strong>Configuration Management</strong> &gt; <strong>Media Asset Management</strong> &gt; <strong>Storage</strong> to view the storage address. If you do not specify this parameter, the default storage address is used.</p>
     * 
     * <strong>example:</strong>
     * <p>outin-bfefbb90a47c******163e1c7426.oss-cn-shanghai.aliyuncs.com</p>
     */
    @NameInMap("StorageLocation")
    public String storageLocation;

    /**
     * <p>The ID of the transcoding template group. You can obtain the ID by using one of the following methods:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Configuration Management</strong> &gt; <strong>Media Processing</strong> &gt; <strong>Transcoding Template Groups</strong> to view the transcoding template group ID.</li>
     * <li>Obtain the value of TranscodeTemplateGroupId from the response when you call the <a href="https://help.aliyun.com/document_detail/102665.html">AddTranscodeTemplateGroup</a> operation.</li>
     * <li>Obtain the value of TranscodeTemplateGroupId from the response when you call the <a href="https://help.aliyun.com/document_detail/102669.html">ListTranscodeTemplateGroup</a> operation.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If you do not specify a transcoding template group ID, the default transcoding template group is used. If you specify a transcoding template group ID, the specified template group is used.</li>
     * <li>You can also set this parameter in <code>UploadMetadatas</code>. If TemplateGroupId is set in both UploadMetadatas and this parameter, the value in UploadMetadatas takes precedence.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ca3a8f6e4957b65806709586****</p>
     */
    @NameInMap("TemplateGroupId")
    public String templateGroupId;

    /**
     * <p>The metadata of the media files to upload. The value is a JSON string.</p>
     * <ul>
     * <li>The metadata takes effect only when it matches a URL in UploadURLs.</li>
     * <li>JSON format: <code>[UploadMetadata, UploadMetadata,…]</code>. The value must be converted to a JSON string.</li>
     * <li>For more information, see the <strong>UploadMetadata</strong> table below.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;SourceURL&quot;:&quot;<a href="https://example.aliyundoc.com/video01.mp4%22,%22Title%22:%22urlUploadTest%22%7D%5D">https://example.aliyundoc.com/video01.mp4&quot;,&quot;Title&quot;:&quot;urlUploadTest&quot;}]</a></p>
     */
    @NameInMap("UploadMetadatas")
    public String uploadMetadatas;

    /**
     * <p>The URLs of media source files.</p>
     * <ul>
     * <li>The URL must include a file name extension. For example, mp4 is the file name extension in <code>https://****.mp4</code>.<ul>
     * <li>If the URL does not include a file name extension, you can specify the FileExtension parameter in <code>UploadMetadatas</code>.</li>
     * <li>If the URL includes a file name extension and the <code>FileExtension</code> parameter is also specified, the value of <code>FileExtension</code> takes precedence.</li>
     * <li>For supported file name extensions, see <a href="https://help.aliyun.com/document_detail/55396.html">Upload overview</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Separate multiple URLs with commas (,). A maximum of 20 URLs are supported. To prevent upload failures caused by special characters, URL-encode each URL before joining them with commas.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>https://****.mp4</p>
     */
    @NameInMap("UploadURLs")
    public String uploadURLs;

    /**
     * <p>The custom settings. The value is a JSON string that supports message callback and upload acceleration settings. For more information, see <a href="~~86952#UserData~~">UserData</a>.</p>
     * <blockquote>
     * <ul>
     * <li>To use message callbacks in this parameter, you must configure an HTTP callback URL and select the corresponding callback event types in the console. Otherwise, the callback settings do not take effect. For information about how to configure HTTP callbacks in the console, see <a href="https://help.aliyun.com/document_detail/86071.html">Callback settings</a>.</li>
     * <li>To use the upload acceleration feature, submit a ticket to activate it. For more information, see <a href="https://help.aliyun.com/document_detail/55396.html">Upload instructions</a>. For information about how to submit a ticket, see <a href="https://help.aliyun.com/document_detail/464625.html">Contact us</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;MessageCallback&quot;:{&quot;CallbackURL&quot;:&quot;<a href="http://example.aliyundoc.com%22%7D,%22Extend%22:%7B%22localId%22:%22xxx%22,%22test%22:%22www%22%7D%7D">http://example.aliyundoc.com&quot;},&quot;Extend&quot;:{&quot;localId&quot;:&quot;xxx&quot;,&quot;test&quot;:&quot;www&quot;}}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The workflow ID. Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Configuration Management</strong> &gt; <strong>Media Processing</strong> &gt; <strong>Workflows</strong> to view the workflow ID.</p>
     * <blockquote>
     * <p>If both WorkflowId and TemplateGroupId are specified, WorkflowId takes precedence. For usage instructions, see <a href="https://help.aliyun.com/document_detail/115347.html">Workflows</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>e1e243b42548248197d6f74f9****</p>
     */
    @NameInMap("WorkflowId")
    public String workflowId;

    public static UploadMediaByURLRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadMediaByURLRequest self = new UploadMediaByURLRequest();
        return TeaModel.build(map, self);
    }

    public UploadMediaByURLRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UploadMediaByURLRequest setEnableFirstFrameCover(Boolean enableFirstFrameCover) {
        this.enableFirstFrameCover = enableFirstFrameCover;
        return this;
    }
    public Boolean getEnableFirstFrameCover() {
        return this.enableFirstFrameCover;
    }

    public UploadMediaByURLRequest setGenerateThumbnail(Boolean generateThumbnail) {
        this.generateThumbnail = generateThumbnail;
        return this;
    }
    public Boolean getGenerateThumbnail() {
        return this.generateThumbnail;
    }

    public UploadMediaByURLRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public UploadMediaByURLRequest setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
        return this;
    }
    public String getStorageLocation() {
        return this.storageLocation;
    }

    public UploadMediaByURLRequest setTemplateGroupId(String templateGroupId) {
        this.templateGroupId = templateGroupId;
        return this;
    }
    public String getTemplateGroupId() {
        return this.templateGroupId;
    }

    public UploadMediaByURLRequest setUploadMetadatas(String uploadMetadatas) {
        this.uploadMetadatas = uploadMetadatas;
        return this;
    }
    public String getUploadMetadatas() {
        return this.uploadMetadatas;
    }

    public UploadMediaByURLRequest setUploadURLs(String uploadURLs) {
        this.uploadURLs = uploadURLs;
        return this;
    }
    public String getUploadURLs() {
        return this.uploadURLs;
    }

    public UploadMediaByURLRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public UploadMediaByURLRequest setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public String getWorkflowId() {
        return this.workflowId;
    }

}
