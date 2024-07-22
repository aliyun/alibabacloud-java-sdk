// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeRecordingResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2019080913202222.wav</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <strong>example:</strong>
     * <p>url</p>
     */
    @NameInMap("FilePath")
    public String filePath;

    /**
     * <strong>example:</strong>
     * <p>14C39896-AE6D-4643-9C9A-E0566B2C2DDD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VoiceSliceRecordingListJson")
    public String voiceSliceRecordingListJson;

    public static DescribeRecordingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordingResponseBody self = new DescribeRecordingResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRecordingResponseBody setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
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

    public DescribeRecordingResponseBody setVoiceSliceRecordingListJson(String voiceSliceRecordingListJson) {
        this.voiceSliceRecordingListJson = voiceSliceRecordingListJson;
        return this;
    }
    public String getVoiceSliceRecordingListJson() {
        return this.voiceSliceRecordingListJson;
    }

}
