// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeRecordingResponseBody extends TeaModel {
    @NameInMap("FilePath")
    public String filePath;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FileName")
    public String fileName;

    public static DescribeRecordingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordingResponseBody self = new DescribeRecordingResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRecordingResponseBody setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public DescribeRecordingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRecordingResponseBody setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
