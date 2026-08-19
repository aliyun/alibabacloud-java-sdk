// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UploadStreamByURLRequest extends TeaModel {
    /**
     * <p>The definition of the video stream.</p>
     * <p>For valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/124671.html">Media asset parameter description - Definition</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HD</p>
     */
    @NameInMap("Definition")
    public String definition;

    /**
     * <p>The file name extension of the transcoded stream file.</p>
     * <p>For supported audio and video file formats, see <a href="https://help.aliyun.com/document_detail/55396.html">Overview</a>.</p>
     * <p>If this parameter is not empty, it overwrites the file name extension in the StreamURL.</p>
     * <blockquote>
     * <p>Notice: This parameter is required if the StreamURL does not contain a file name extension.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>mp4</p>
     */
    @NameInMap("FileExtension")
    public String fileExtension;

    /**
     * <p>The HDR type of the transcoded stream. Valid values:</p>
     * <ul>
     * <li>HDR</li>
     * <li>HDR10</li>
     * <li>HLG</li>
     * <li>DolbyVision</li>
     * <li>HDRVivid</li>
     * <li>SDR+<blockquote>
     * <ul>
     * <li>Case-insensitive.</li>
     * <li>Leave this parameter empty for non-HDR videos.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HDR10</p>
     */
    @NameInMap("HDRType")
    public String HDRType;

    /**
     * <p>The ID of the ApsaraVideo VOD media asset that corresponds to the transcoded stream.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca3a8f6e49*****57b65806709586</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The URL of the transcoded stream file.</p>
     * <p>If the URL of the transcoded stream requires authentication, include the authentication parameters in StreamURL and make sure the URL is accessible through public network access.</p>
     * <blockquote>
     * <p>You can obtain the audio or video URL from the console or by invoking the GetPlayInfo operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/lesson-01.mp4">https://example.com/lesson-01.mp4</a></p>
     */
    @NameInMap("StreamURL")
    public String streamURL;

    /**
     * <p>The metadata of the media file to upload. The value is a JSON string.</p>
     * <ul>
     * <li>For more information, see the <strong>UploadMetadata</strong> table below.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AddressMapping&quot;:&quot;1&quot;,&quot;CustomPath&quot;:&quot;test/xxx&quot;,&quot;CustomFileName&quot;:&quot;xxx.mp4&quot;,&quot;isOverwritePath&quot;:&quot;0&quot;}</p>
     */
    @NameInMap("UploadMetadata")
    public String uploadMetadata;

    /**
     * <p>The custom parameter. For more information, see <a href="https://help.aliyun.com/document_detail/86952.html">UserData</a>.</p>
     * <blockquote>
     * <p>To use the message callback in this parameter, configure the HTTP callback URL and select the corresponding callback event types in the console. Otherwise, the callback settings do not take effect. For information about how to configure HTTP callbacks in the console, see <a href="https://help.aliyun.com/document_detail/86071.html">Callback settings</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;MessageCallback&quot;:{&quot;CallbackURL&quot;:&quot;<a href="http://aliyundoc.com%22%7D">http://aliyundoc.com&quot;}</a>, &quot;Extend&quot;:{&quot;localId&quot;:&quot;xxx&quot;,&quot;test&quot;:&quot;www&quot;}}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static UploadStreamByURLRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadStreamByURLRequest self = new UploadStreamByURLRequest();
        return TeaModel.build(map, self);
    }

    public UploadStreamByURLRequest setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public UploadStreamByURLRequest setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
        return this;
    }
    public String getFileExtension() {
        return this.fileExtension;
    }

    public UploadStreamByURLRequest setHDRType(String HDRType) {
        this.HDRType = HDRType;
        return this;
    }
    public String getHDRType() {
        return this.HDRType;
    }

    public UploadStreamByURLRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public UploadStreamByURLRequest setStreamURL(String streamURL) {
        this.streamURL = streamURL;
        return this;
    }
    public String getStreamURL() {
        return this.streamURL;
    }

    public UploadStreamByURLRequest setUploadMetadata(String uploadMetadata) {
        this.uploadMetadata = uploadMetadata;
        return this;
    }
    public String getUploadMetadata() {
        return this.uploadMetadata;
    }

    public UploadStreamByURLRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
