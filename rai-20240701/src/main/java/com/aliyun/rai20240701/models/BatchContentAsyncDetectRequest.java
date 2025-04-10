// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class BatchContentAsyncDetectRequest extends TeaModel {
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
     * <p>textDetection</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("serviceParameterList")
    public java.util.List<BatchContentAsyncDetectRequestServiceParameterList> serviceParameterList;

    public static BatchContentAsyncDetectRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchContentAsyncDetectRequest self = new BatchContentAsyncDetectRequest();
        return TeaModel.build(map, self);
    }

    public BatchContentAsyncDetectRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public BatchContentAsyncDetectRequest setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

    public BatchContentAsyncDetectRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public BatchContentAsyncDetectRequest setServiceParameterList(java.util.List<BatchContentAsyncDetectRequestServiceParameterList> serviceParameterList) {
        this.serviceParameterList = serviceParameterList;
        return this;
    }
    public java.util.List<BatchContentAsyncDetectRequestServiceParameterList> getServiceParameterList() {
        return this.serviceParameterList;
    }

    public static class BatchContentAsyncDetectRequestServiceParameterList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>&quot;XXXXXXXX&quot;</p>
         */
        @NameInMap("content")
        public String content;

        public static BatchContentAsyncDetectRequestServiceParameterList build(java.util.Map<String, ?> map) throws Exception {
            BatchContentAsyncDetectRequestServiceParameterList self = new BatchContentAsyncDetectRequestServiceParameterList();
            return TeaModel.build(map, self);
        }

        public BatchContentAsyncDetectRequestServiceParameterList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

}
