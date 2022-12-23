// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UploadStreamByURLResponseBody extends TeaModel {
    // The URL of the OSS object.
    @NameInMap("FileURL")
    public String fileURL;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The URL of the input stream. This parameter is used when you call the [GetURLUploadInfos](~~106830~~) operation.
    @NameInMap("SourceURL")
    public String sourceURL;

    // The ID of the stream upload job. This parameter is used when you call the [GetURLUploadInfos](~~106830~~) operation.
    // 
    // In ApsaraVideo VOD, you can upload only one transcoded stream in an upload job. For more information, see the PlayInfo: the playback information about a video stream section in [Basic structures](~~52839~~).
    @NameInMap("StreamJobId")
    public String streamJobId;

    public static UploadStreamByURLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadStreamByURLResponseBody self = new UploadStreamByURLResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadStreamByURLResponseBody setFileURL(String fileURL) {
        this.fileURL = fileURL;
        return this;
    }
    public String getFileURL() {
        return this.fileURL;
    }

    public UploadStreamByURLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadStreamByURLResponseBody setSourceURL(String sourceURL) {
        this.sourceURL = sourceURL;
        return this;
    }
    public String getSourceURL() {
        return this.sourceURL;
    }

    public UploadStreamByURLResponseBody setStreamJobId(String streamJobId) {
        this.streamJobId = streamJobId;
        return this;
    }
    public String getStreamJobId() {
        return this.streamJobId;
    }

}
