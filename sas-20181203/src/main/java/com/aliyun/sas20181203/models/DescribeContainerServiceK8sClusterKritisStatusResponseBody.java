// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerServiceK8sClusterKritisStatusResponseBody extends TeaModel {
    /**
     * <p>The Kritis status of the ACK cluster.</p>
     */
    @NameInMap("KritisStatus")
    public DescribeContainerServiceK8sClusterKritisStatusResponseBodyKritisStatus kritisStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BE120DAB-F4E7-4C53-ADC3-A97578AB****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeContainerServiceK8sClusterKritisStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerServiceK8sClusterKritisStatusResponseBody self = new DescribeContainerServiceK8sClusterKritisStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContainerServiceK8sClusterKritisStatusResponseBody setKritisStatus(DescribeContainerServiceK8sClusterKritisStatusResponseBodyKritisStatus kritisStatus) {
        this.kritisStatus = kritisStatus;
        return this;
    }
    public DescribeContainerServiceK8sClusterKritisStatusResponseBodyKritisStatus getKritisStatus() {
        return this.kritisStatus;
    }

    public DescribeContainerServiceK8sClusterKritisStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeContainerServiceK8sClusterKritisStatusResponseBodyKritisStatus extends TeaModel {
        /**
         * <p>Indicates whether Kritis is installed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Install")
        public Boolean install;

        public static DescribeContainerServiceK8sClusterKritisStatusResponseBodyKritisStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerServiceK8sClusterKritisStatusResponseBodyKritisStatus self = new DescribeContainerServiceK8sClusterKritisStatusResponseBodyKritisStatus();
            return TeaModel.build(map, self);
        }

        public DescribeContainerServiceK8sClusterKritisStatusResponseBodyKritisStatus setInstall(Boolean install) {
            this.install = install;
            return this;
        }
        public Boolean getInstall() {
            return this.install;
        }

    }

}
