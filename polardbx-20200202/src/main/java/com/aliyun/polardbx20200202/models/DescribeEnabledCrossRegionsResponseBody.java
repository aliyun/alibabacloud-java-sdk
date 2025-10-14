// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeEnabledCrossRegionsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeEnabledCrossRegionsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3WE34</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeEnabledCrossRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnabledCrossRegionsResponseBody self = new DescribeEnabledCrossRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEnabledCrossRegionsResponseBody setData(java.util.List<DescribeEnabledCrossRegionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeEnabledCrossRegionsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeEnabledCrossRegionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeEnabledCrossRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEnabledCrossRegionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeEnabledCrossRegionsResponseBodyData extends TeaModel {
        @NameInMap("Regions")
        public java.util.List<String> regions;

        public static DescribeEnabledCrossRegionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnabledCrossRegionsResponseBodyData self = new DescribeEnabledCrossRegionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeEnabledCrossRegionsResponseBodyData setRegions(java.util.List<String> regions) {
            this.regions = regions;
            return this;
        }
        public java.util.List<String> getRegions() {
            return this.regions;
        }

    }

}
