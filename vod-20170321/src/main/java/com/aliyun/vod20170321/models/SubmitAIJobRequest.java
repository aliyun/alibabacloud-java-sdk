// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIJobRequest extends TeaModel {
    /**
     * <p>The AI job configuration in JSON format.</p>
     * <ul>
     * <li>If <code>Types</code> is set to <code>AIVideoTag</code>, <code>Config</code> supports the <code>AnalyseTypes</code> parameter to specify the analysis algorithm types for the intelligent tagging job. Valid values:<ul>
     * <li>ASR: speech recognition. Identifies tags from the audio speech in the video.</li>
     * <li>OCR: optical character recognition. Identifies tags from the text in the video images.</li>
     * </ul>
     * </li>
     * <li>If <code>Types</code> is set to <code>AIMediaDNA</code>, <code>Config</code> supports the <code>DNADBId</code> parameter to specify the fingerprint library ID for the media fingerprint job.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AIVideoTag&quot;: {&quot;AnalyseTypes&quot;: &quot;ASR&quot;} }</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The video ID. You can obtain the video ID by using one of the following methods:</p>
     * <ul>
     * <li>For videos uploaded in the console, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong> to view the video ID.</li>
     * <li>When you call the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation to obtain the upload URL and credential, the video ID is the value of the VideoId response parameter.</li>
     * <li>After the video is uploaded, you can call the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation to query the video ID, which is the value of the VideoId response parameter.</li>
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
     * <p>The AI job type. Separate multiple job types with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>AIMediaDNA</strong>: media fingerprint.</li>
     * <li><strong>AIVideoTag</strong>: intelligent tagging.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AIVideoTag</p>
     */
    @NameInMap("Types")
    public String types;

    /**
     * <p>The custom settings in JSON format. For more information about the parameter structure, see <a href="~~86952#h2--userdata-div-id-userdata-div-3~~">UserData</a>.</p>
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
