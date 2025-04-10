// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class BatchContentSyncDetectRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("SceneName")
    public String sceneName;

    /**
     * <strong>example:</strong>
     * <p>textDetection
     * imageDetection</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("serviceParameterList")
    public java.util.List<BatchContentSyncDetectRequestServiceParameterList> serviceParameterList;

    public static BatchContentSyncDetectRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchContentSyncDetectRequest self = new BatchContentSyncDetectRequest();
        return TeaModel.build(map, self);
    }

    public BatchContentSyncDetectRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public BatchContentSyncDetectRequest setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

    public BatchContentSyncDetectRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public BatchContentSyncDetectRequest setServiceParameterList(java.util.List<BatchContentSyncDetectRequestServiceParameterList> serviceParameterList) {
        this.serviceParameterList = serviceParameterList;
        return this;
    }
    public java.util.List<BatchContentSyncDetectRequestServiceParameterList> getServiceParameterList() {
        return this.serviceParameterList;
    }

    public static class BatchContentSyncDetectRequestServiceParameterList extends TeaModel {
        @NameInMap("content")
        public String content;

        public static BatchContentSyncDetectRequestServiceParameterList build(java.util.Map<String, ?> map) throws Exception {
            BatchContentSyncDetectRequestServiceParameterList self = new BatchContentSyncDetectRequestServiceParameterList();
            return TeaModel.build(map, self);
        }

        public BatchContentSyncDetectRequestServiceParameterList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

}
