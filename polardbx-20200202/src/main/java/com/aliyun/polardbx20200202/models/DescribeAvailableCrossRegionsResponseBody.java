// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeAvailableCrossRegionsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeAvailableCrossRegionsResponseBodyData> data;

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
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeAvailableCrossRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableCrossRegionsResponseBody self = new DescribeAvailableCrossRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableCrossRegionsResponseBody setData(java.util.List<DescribeAvailableCrossRegionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeAvailableCrossRegionsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeAvailableCrossRegionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAvailableCrossRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAvailableCrossRegionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAvailableCrossRegionsResponseBodyData extends TeaModel {
        @NameInMap("Regions")
        public java.util.List<String> regions;

        public static DescribeAvailableCrossRegionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableCrossRegionsResponseBodyData self = new DescribeAvailableCrossRegionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableCrossRegionsResponseBodyData setRegions(java.util.List<String> regions) {
            this.regions = regions;
            return this;
        }
        public java.util.List<String> getRegions() {
            return this.regions;
        }

    }

}
