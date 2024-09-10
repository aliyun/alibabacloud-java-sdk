// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckResultResponseBody extends TeaModel {
    /**
     * <p>The check results.</p>
     */
    @NameInMap("CheckResultList")
    public java.util.List<DescribeCheckResultResponseBodyCheckResultList> checkResultList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>571B2642-BF51-5BDD-906B-D2340DB9****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCheckResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckResultResponseBody self = new DescribeCheckResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCheckResultResponseBody setCheckResultList(java.util.List<DescribeCheckResultResponseBodyCheckResultList> checkResultList) {
        this.checkResultList = checkResultList;
        return this;
    }
    public java.util.List<DescribeCheckResultResponseBodyCheckResultList> getCheckResultList() {
        return this.checkResultList;
    }

    public DescribeCheckResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCheckResultResponseBodyCheckResultList extends TeaModel {
        /**
         * <p>The compliance status. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: compliant</li>
         * <li><strong>0</strong>: non-compliant</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ComplianceStatus")
        public Integer complianceStatus;

        /**
         * <p>The name of the corresponding section. Valid values:</p>
         * <ul>
         * <li><strong>information_classification</strong>: information classification</li>
         * <li><strong>information_mark</strong>: information labeling</li>
         * <li><strong>network_security_policy</strong>: access to networks and network services</li>
         * <li><strong>login_control</strong>: secure logon procedures</li>
         * <li><strong>week_password</strong>: password management system</li>
         * <li><strong>key_manage</strong>: key management</li>
         * <li><strong>malicious_software</strong>: protection against malware</li>
         * <li><strong>information_backup</strong>: information backup</li>
         * <li><strong>audit_policy</strong>: information system audit control mechanisms</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>information_mark</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeCheckResultResponseBodyCheckResultList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCheckResultResponseBodyCheckResultList self = new DescribeCheckResultResponseBodyCheckResultList();
            return TeaModel.build(map, self);
        }

        public DescribeCheckResultResponseBodyCheckResultList setComplianceStatus(Integer complianceStatus) {
            this.complianceStatus = complianceStatus;
            return this;
        }
        public Integer getComplianceStatus() {
            return this.complianceStatus;
        }

        public DescribeCheckResultResponseBodyCheckResultList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
