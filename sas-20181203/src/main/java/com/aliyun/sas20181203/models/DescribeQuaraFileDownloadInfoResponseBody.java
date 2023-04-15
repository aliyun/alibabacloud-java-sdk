// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeQuaraFileDownloadInfoResponseBody extends TeaModel {
    /**
     * <p>The URL that is used to download the file. The URL is valid for five minutes.</p>
     */
    @NameInMap("DownloadUrl")
    public String downloadUrl;

    /**
     * <p>The MD5 hash value of the quarantined file.</p>
     */
    @NameInMap("Md5")
    public String md5;

    /**
     * <p>The file path.</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The ID of the quarantined file.</p>
     */
    @NameInMap("QuaraFileId")
    public Integer quaraFileId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The tag that is added to the related alert.</p>
     */
    @NameInMap("Tag")
    public String tag;

    /**
     * <p>The UUID of the server.</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static DescribeQuaraFileDownloadInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeQuaraFileDownloadInfoResponseBody self = new DescribeQuaraFileDownloadInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeQuaraFileDownloadInfoResponseBody setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public DescribeQuaraFileDownloadInfoResponseBody setMd5(String md5) {
        this.md5 = md5;
        return this;
    }
    public String getMd5() {
        return this.md5;
    }

    public DescribeQuaraFileDownloadInfoResponseBody setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public DescribeQuaraFileDownloadInfoResponseBody setQuaraFileId(Integer quaraFileId) {
        this.quaraFileId = quaraFileId;
        return this;
    }
    public Integer getQuaraFileId() {
        return this.quaraFileId;
    }

    public DescribeQuaraFileDownloadInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeQuaraFileDownloadInfoResponseBody setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public DescribeQuaraFileDownloadInfoResponseBody setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
