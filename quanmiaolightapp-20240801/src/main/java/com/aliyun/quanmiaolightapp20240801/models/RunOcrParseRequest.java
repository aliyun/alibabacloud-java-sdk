// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunOcrParseRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>oss://default/aimiaobi-service-prod/aimiaobi/temp/public/government_service_experience_feedback_summary.txt</p>
     */
    @NameInMap("fileKey")
    public String fileKey;

    @NameInMap("modelId")
    public String modelId;

    /**
     * <strong>example:</strong>
     * <p><a href="http://www.example.com/xxxx.txt">http://www.example.com/xxxx.txt</a></p>
     */
    @NameInMap("url")
    public String url;

    public static RunOcrParseRequest build(java.util.Map<String, ?> map) throws Exception {
        RunOcrParseRequest self = new RunOcrParseRequest();
        return TeaModel.build(map, self);
    }

    public RunOcrParseRequest setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public RunOcrParseRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public RunOcrParseRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
