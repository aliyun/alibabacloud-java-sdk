// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UploadStreamByURLRequest extends TeaModel {
    /**
     * <p>The quality of the video stream.</p>
     * <p>For more information about valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/124671.html">Parameters for media assets</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HD</p>
     */
    @NameInMap("Definition")
    public String definition;

    /**
     * <p>The file name extension of the transcoded stream.</p>
     * <p>For more information, see the Supported media file formats section in <a href="https://help.aliyun.com/document_detail/55396.html">Overview</a>.</p>
     * <p>If you set a value for this parameter, the file name extension specified in StreamURL is overwritten.</p>
     * <blockquote>
     * <p> This parameter is required if you do not specify a file name extension in StreamURL.</p>
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
     * <li>SDR+</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The HDR type of the transcoded stream is not case-sensitive.</p>
     * </li>
     * <li><p>You can leave this parameter empty for non-HDR streams.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HDR10</p>
     */
    @NameInMap("HDRType")
    public String HDRType;

    /**
     * <p>The media ID in ApsaraVideo VOD.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca3a8f6e49*****57b65806709586</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The URL of the transcoded stream.</p>
     * <p>If URL authentication is required, you must pass authentication information in this parameter and make sure that the URL can be accessed over the Internet.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/lesson-01.mp4">https://example.com/lesson-01.mp4</a></p>
     */
    @NameInMap("StreamURL")
    public String streamURL;

    /**
     * <p>The user-defined parameter. For more information, see the &quot;UserData: specifies the custom configurations for media upload&quot; section of the <a href="https://help.aliyun.com/document_detail/86952.html">Request parameters</a> topic.</p>
     * <blockquote>
     * <p> The callback configurations you specify for this parameter take effect only after you specify the HTTP callback URL and select specific callback events in the ApsaraVideo VOD console. For more information about how to configure HTTP callback settings in the ApsaraVideo VOD console, see <a href="https://help.aliyun.com/document_detail/86071.html">Configure callback settings</a>.</p>
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

    public UploadStreamByURLRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
