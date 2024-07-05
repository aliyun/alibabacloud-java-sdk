// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UploadMediaByURLRequest extends TeaModel {
    /**
     * <p>The ID of the application. Default value: <strong>app-1000000</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>app-****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The custom identifier for deduplication. If you specify this parameter and send a request, an error is returned if a request with the same identifier was sent in the last 10 minutes. A custom identifier can be up to 50 characters in length and can contain letters, digits, hyphens (-), and underscores (_). If you do not specify this parameter or leave this parameter empty, duplicate requests are not filtered.</p>
     * 
     * <strong>example:</strong>
     * <p>5c62d40299034bbaa4c195da330****</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The storage address of the media file.</p>
     * <p>To view the storage address, log on to the <a href="https://vod.console.aliyun.com/?spm=a2c4g.11186623.2.15.6948257eaZ4m54#/vod/settings/censored">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Configuration Management</strong> &gt; <strong>Media Management</strong> &gt; <strong>Storage</strong>. If you do not specify a storage address, the default storage address is used.</p>
     * 
     * <strong>example:</strong>
     * <p>outin-bfefbb90a47c******163e1c7426.oss-cn-shanghai.aliyuncs.com</p>
     */
    @NameInMap("StorageLocation")
    public String storageLocation;

    /**
     * <p>The ID of the transcoding template group. You can use one of the following methods to obtain the ID of the transcoding template group:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Configuration Management</strong> &gt; <strong>Media Processing</strong> &gt; <strong>Transcoding Template Groups</strong>. On the Transcoding Template Groups page, view the ID of the transcoding template group.</li>
     * <li>Obtain the value of TranscodeTemplateGroupId from the response to the <a href="https://help.aliyun.com/document_detail/102665.html">AddTranscodeTemplateGroup</a> operation.</li>
     * <li>Obtain the value of TranscodeTemplateGroupId from the response to the <a href="https://help.aliyun.com/document_detail/102669.html">ListTranscodeTemplateGroup</a> operation.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If you leave this parameter empty, the default transcoding template group is used for transcoding. If you specify this parameter, the specified transcoding template group is used for transcoding.</li>
     * <li>You can also specify the ID of the transcoding template group in <code>UploadMetadatas</code>. If you specify this parameter and TemplateGroupId in UploadMetadatas, the TemplateGroupId in UploadMetadatas takes effect.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ca3a8f6e4957b65806709586****</p>
     */
    @NameInMap("TemplateGroupId")
    public String templateGroupId;

    /**
     * <p>The metadata of the media file that you want to upload. The value must be a JSON string.</p>
     * <ul>
     * <li>This parameter takes effect only if SourceURL matches the URL that you specified for UploadURLs.</li>
     * <li>You must convert the JSON-formatted data such as <code>[UploadMetadata, UploadMetadata,…]</code> to a JSON string.</li>
     * <li>For more information, see the <strong>UploadMetadata</strong> table.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;SourceURL&quot;:&quot;<a href="https://example.aliyundoc.com/video01.mp4%22,%22Title%22:%22urlUploadTest%22%7D%5D">https://example.aliyundoc.com/video01.mp4&quot;,&quot;Title&quot;:&quot;urlUploadTest&quot;}]</a></p>
     */
    @NameInMap("UploadMetadatas")
    public String uploadMetadatas;

    /**
     * <p>The URL of the media file.</p>
     * <ul>
     * <li><p>You must include a file name extension in the URL, such as <code>https://****.mp4</code>.</p>
     * <ul>
     * <li>If the URL does not contain a file name extension, specify a file name extension for <code>FileExtension</code> in <code>UploadMetadatas</code>.</li>
     * <li>If you specify <code>FileExtension</code> when the URL contains a file name extension, the file name extension that you specified for <code>FileExtension</code> takes effect.</li>
     * <li>For more information about file name extensions supported by ApsaraVideo VOD, see <a href="https://help.aliyun.com/document_detail/55396.html">Overview</a>.</li>
     * </ul>
     * </li>
     * <li><p>URL encoding is required. Separate multiple URLs with commas (,). You can specify a maximum of 20 URLs.</p>
     * </li>
     * <li><p>Special characters may cause upload failures. You must encode URLs before you separate them with commas (,).</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>https://****.mp4</p>
     */
    @NameInMap("UploadURLs")
    public String uploadURLs;

    /**
     * <p>The custom configurations such as callback configurations and upload acceleration configurations. The value must be a JSON string. For more information, see <a href="~~86952#UserData~~">Request parameters</a>.</p>
     * <blockquote>
     * <ul>
     * <li>The callback configurations take effect only after you specify the HTTP callback URL and select specific callback events in the ApsaraVideo VOD console. For more information about how to configure HTTP callback settings in the ApsaraVideo VOD console, see <a href="https://help.aliyun.com/document_detail/86071.html">Configure callback settings</a>.</li>
     * <li>If you want to enable the upload acceleration feature, <a href="https://yida.alibaba-inc.com/o/ticketapply">submit a request on Yida</a>. For more information, see <a href="https://help.aliyun.com/document_detail/55396.html">Overview</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;MessageCallback&quot;:{&quot;CallbackURL&quot;:&quot;<a href="http://example.aliyundoc.com%22%7D,%22Extend%22:%7B%22localId%22:%22xxx%22,%22test%22:%22www%22%7D%7D">http://example.aliyundoc.com&quot;},&quot;Extend&quot;:{&quot;localId&quot;:&quot;xxx&quot;,&quot;test&quot;:&quot;www&quot;}}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The ID of the workflow. To view the ID of the workflow, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Configuration Management</strong> &gt; <strong>Media Processing</strong> &gt; <strong>Workflows</strong>.</p>
     * <blockquote>
     * <p>If you specify WorkflowId and TemplateGroupId, the value of WorkflowId takes effect. For more information, see <a href="https://help.aliyun.com/document_detail/115347.html">Workflows</a>.</p>
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
