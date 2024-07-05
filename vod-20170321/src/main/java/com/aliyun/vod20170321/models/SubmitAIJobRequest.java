// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIJobRequest extends TeaModel {
    /**
     * <p>The configurations of the AI job. The value is a JSON string.</p>
     * <ul>
     * <li><p>If you set <code>Types</code> to <code>AIVideoTag</code>, you can specify <code>AnalyseTypes</code> for <code>Config</code> to set the analysis algorithm of a smart tagging job. Valid values:</p>
     * <ul>
     * <li>ASR: automatic speech recognition (ASR)</li>
     * <li>OCR: image optical character recognition (OCR)</li>
     * </ul>
     * </li>
     * <li><p>If you set <code>Types</code> to <code>AIMediaDNA</code>, you can specify <code>DNADBId</code> for <code>Config</code> to set the ID of the media fingerprint library for video fingerprinting jobs.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AIVideoTag&quot;: {&quot;AnalyseTypes&quot;: &quot;Face,ASR&quot;} }</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The ID of the video. You can use one of the following methods to obtain the ID:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD</a> console. In the left-side navigation pane, choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong>. On the Video and Audio page, view the ID of the audio or video file. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.</li>
     * <li>Obtain the value of VideoId from the response to the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation that you call to upload media files.</li>
     * <li>Obtain the value of VideoId from the response to the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation after you upload media files.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3D3D12340d9401fab46a0b847****</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    /**
     * <p>The type of the AI job. Separate multiple types with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>AIMediaDNA</strong>: The media fingerprinting job.</li>
     * <li><strong>AIVideoTag</strong>: The smart tagging job.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AIVideoTag</p>
     */
    @NameInMap("Types")
    public String types;

    /**
     * <p>The custom settings. The value is a JSON string. For more information, see <a href="~~86952#h2--userdata-div-id-userdata-div-3~~">Request parameters</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Extend&quot;:{&quot;localId&quot;:&quot;***&quot;,&quot;test&quot;:&quot;www&quot;}}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitAIJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIJobRequest self = new SubmitAIJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAIJobRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public SubmitAIJobRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public SubmitAIJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SubmitAIJobRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public SubmitAIJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitAIJobRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitAIJobRequest setTypes(String types) {
        this.types = types;
        return this;
    }
    public String getTypes() {
        return this.types;
    }

    public SubmitAIJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
