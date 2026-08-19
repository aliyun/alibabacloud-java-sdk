// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UploadStreamByURLResponseBody extends TeaModel {
    /**
     * <p>The OSS file URL of the transcoded stream.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://outin-31059bcee7810a200163e1c8dba****.oss-cn-shanghai.aliyuncs.com/lesson-01.mp4">http://outin-31059bcee7810a200163e1c8dba****.oss-cn-shanghai.aliyuncs.com/lesson-01.mp4</a></p>
     */
    @NameInMap("FileURL")
    public String fileURL;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7AE96389-DF1E-598D-816B-7B40F13B4620</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The input URL of the transcoded stream. This value can be used as a request parameter of the <a href="https://help.aliyun.com/document_detail/106830.html">GetURLUploadInfos</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/lesson-01.mp4">https://example.com/lesson-01.mp4</a></p>
     */
    @NameInMap("SourceURL")
    public String sourceURL;

    /**
     * <p>The job ID of the transcoded stream. This value can be used as a request parameter of the <a href="https://help.aliyun.com/document_detail/106830.html">GetURLUploadInfos</a> operation.</p>
     * <p>ApsaraVideo VOD uses the job ID to uniquely identify a transcoded stream file. For more information, see <a href="https://help.aliyun.com/document_detail/52839.html">Basic data types - PlayInfo</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>e304b34fb3d959f92baef97b6496****</p>
     */
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
