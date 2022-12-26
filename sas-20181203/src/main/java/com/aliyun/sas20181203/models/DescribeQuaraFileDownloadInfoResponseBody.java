// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeQuaraFileDownloadInfoResponseBody extends TeaModel {
    @NameInMap("DownloadUrl")
    public String downloadUrl;

    @NameInMap("Md5")
    public String md5;

    @NameInMap("Path")
    public String path;

    @NameInMap("QuaraFileId")
    public Integer quaraFileId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tag")
    public String tag;

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
