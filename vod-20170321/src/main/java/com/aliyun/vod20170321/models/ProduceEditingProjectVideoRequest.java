// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ProduceEditingProjectVideoRequest extends TeaModel {
    /**
     * <p>The application ID. Default value: <strong>app-1000000</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Multi-application</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>app-****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The thumbnail of the online editing project.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.aliyundoc.com/6AB4D0E1E1C7446888351****.png">https://example.aliyundoc.com/6AB4D0E1E1C7446888351****.png</a></p>
     */
    @NameInMap("CoverURL")
    public String coverURL;

    /**
     * <p>The description of the online editing project.</p>
     * 
     * <strong>example:</strong>
     * <p>Cloud clip project description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The metadata of the produced video in JSON format. For more information about the structure, see <a href="~~52839#title-rtf-ry5-gjp~~">MediaMetadata</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Description&quot;:&quot;Synthetic Video Description&quot;,&quot;Title&quot;:&quot;Synthetic userData test&quot;}</p>
     */
    @NameInMap("MediaMetadata")
    public String mediaMetadata;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The production configuration in JSON format. For more information about the structure, see <a href="~~52839#title-ybl-7cs-y7d~~">ProduceConfig</a>.
     * <notice>
     * The StorageLocation field can be ignored when the file storage region is Shanghai. It is required when the file storage region is in other regions.
     * </notice></p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;TemplateGroupId&quot;:&quot;6d11e25ea30a4c465435c74****&quot;}</p>
     */
    @NameInMap("ProduceConfig")
    public String produceConfig;

    /**
     * <p>The online editing project ID. You can obtain the ID by using one of the following methods:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>, choose <strong>Production Center</strong> &gt; <strong>Video Editing</strong>, and view the ID.</li>
     * <li>Obtain the value of the ProjectId parameter returned when you call the <a href="https://help.aliyun.com/document_detail/69048.html">CreateEditingProject</a> operation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>fb2101bf24b4cb318787dc****</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The timeline of the online editing project in JSON format. For more information about the structure, see <a href="~~52839#07bc7fe0f2xuh~~">Timeline</a>.</p>
     * <blockquote>
     * <p>Make sure that each VideoTrackClip object contains a valid MediaId. Otherwise, the request fails.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;VideoTracks&quot;:[{&quot;VideoTrackClips&quot;:[{&quot;MediaId&quot;:&quot;cc3308ac59615a54328bc3443****&quot;},{&quot;MediaId&quot;:&quot;da87a9cff645cd88bc6d8326e4****&quot;}]}]}</p>
     */
    @NameInMap("Timeline")
    public String timeline;

    /**
     * <p>The title of the online editing project.</p>
     * 
     * <strong>example:</strong>
     * <p>Cloud Clip Project Title</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The custom settings in JSON format. The maximum length is 256 characters. The settings support message callbacks and other configurations. For more information about the structure, see <a href="~~86952#title-vz7-xzs-0c5~~">UserData</a>.</p>
     * <blockquote>
     * <p>To use the message callback in this parameter, configure the HTTP callback URL and select the corresponding callback event types in the console. Otherwise, the callback settings do not take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Extend&quot;:{&quot;width&quot;:1280,&quot;id&quot;:&quot;028a8e56b1ebf6bb7afc74****&quot;,&quot;height&quot;:720},&quot;MessageCallback&quot;:{&quot;CallbackURL&quot;:&quot;<a href="https://example.aliyundoc.com/2016-08-15/proxy/httpcallback/testcallback/%22,%22CallbackType%22:%22http%22%7D%7D">https://example.aliyundoc.com/2016-08-15/proxy/httpcallback/testcallback/&quot;,&quot;CallbackType&quot;:&quot;http&quot;}}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    public static ProduceEditingProjectVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        ProduceEditingProjectVideoRequest self = new ProduceEditingProjectVideoRequest();
        return TeaModel.build(map, self);
    }

    public ProduceEditingProjectVideoRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ProduceEditingProjectVideoRequest setCoverURL(String coverURL) {
        this.coverURL = coverURL;
        return this;
    }
    public String getCoverURL() {
        return this.coverURL;
    }

    public ProduceEditingProjectVideoRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ProduceEditingProjectVideoRequest setMediaMetadata(String mediaMetadata) {
        this.mediaMetadata = mediaMetadata;
        return this;
    }
    public String getMediaMetadata() {
        return this.mediaMetadata;
    }

    public ProduceEditingProjectVideoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ProduceEditingProjectVideoRequest setProduceConfig(String produceConfig) {
        this.produceConfig = produceConfig;
        return this;
    }
    public String getProduceConfig() {
        return this.produceConfig;
    }

    public ProduceEditingProjectVideoRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ProduceEditingProjectVideoRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ProduceEditingProjectVideoRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ProduceEditingProjectVideoRequest setTimeline(String timeline) {
        this.timeline = timeline;
        return this;
    }
    public String getTimeline() {
        return this.timeline;
    }

    public ProduceEditingProjectVideoRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public ProduceEditingProjectVideoRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
