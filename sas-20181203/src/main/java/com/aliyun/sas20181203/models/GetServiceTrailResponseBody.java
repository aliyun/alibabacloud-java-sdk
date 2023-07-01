// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetServiceTrailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceTrail")
    public GetServiceTrailResponseBodyServiceTrail serviceTrail;

    public static GetServiceTrailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceTrailResponseBody self = new GetServiceTrailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceTrailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceTrailResponseBody setServiceTrail(GetServiceTrailResponseBodyServiceTrail serviceTrail) {
        this.serviceTrail = serviceTrail;
        return this;
    }
    public GetServiceTrailResponseBodyServiceTrail getServiceTrail() {
        return this.serviceTrail;
    }

    public static class GetServiceTrailResponseBodyServiceTrail extends TeaModel {
        @NameInMap("Config")
        public String config;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("UpdateTime")
        public Long updateTime;

        public static GetServiceTrailResponseBodyServiceTrail build(java.util.Map<String, ?> map) throws Exception {
            GetServiceTrailResponseBodyServiceTrail self = new GetServiceTrailResponseBodyServiceTrail();
            return TeaModel.build(map, self);
        }

        public GetServiceTrailResponseBodyServiceTrail setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public GetServiceTrailResponseBodyServiceTrail setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetServiceTrailResponseBodyServiceTrail setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
