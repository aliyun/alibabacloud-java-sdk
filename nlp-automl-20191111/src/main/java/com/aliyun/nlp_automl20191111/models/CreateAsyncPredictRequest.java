// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20191111.models;

import com.aliyun.tea.*;

public class CreateAsyncPredictRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("DetailTag")
    public String detailTag;

    @NameInMap("FetchContent")
    public String fetchContent;

    @NameInMap("FileContent")
    public String fileContent;

    @NameInMap("FileType")
    public String fileType;

    @NameInMap("FileUrl")
    public String fileUrl;

    @NameInMap("ModelId")
    public Integer modelId;

    @NameInMap("ModelVersion")
    public String modelVersion;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("ServiceVersion")
    public String serviceVersion;

    @NameInMap("TopK")
    public Integer topK;

    public static CreateAsyncPredictRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAsyncPredictRequest self = new CreateAsyncPredictRequest();
        return TeaModel.build(map, self);
    }

    public CreateAsyncPredictRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateAsyncPredictRequest setDetailTag(String detailTag) {
        this.detailTag = detailTag;
        return this;
    }
    public String getDetailTag() {
        return this.detailTag;
    }

    public CreateAsyncPredictRequest setFetchContent(String fetchContent) {
        this.fetchContent = fetchContent;
        return this;
    }
    public String getFetchContent() {
        return this.fetchContent;
    }

    public CreateAsyncPredictRequest setFileContent(String fileContent) {
        this.fileContent = fileContent;
        return this;
    }
    public String getFileContent() {
        return this.fileContent;
    }

    public CreateAsyncPredictRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public CreateAsyncPredictRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public CreateAsyncPredictRequest setModelId(Integer modelId) {
        this.modelId = modelId;
        return this;
    }
    public Integer getModelId() {
        return this.modelId;
    }

    public CreateAsyncPredictRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

    public CreateAsyncPredictRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public CreateAsyncPredictRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public CreateAsyncPredictRequest setTopK(Integer topK) {
        this.topK = topK;
        return this;
    }
    public Integer getTopK() {
        return this.topK;
    }

}
