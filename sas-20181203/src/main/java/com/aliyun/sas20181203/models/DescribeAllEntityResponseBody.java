// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAllEntityResponseBody extends TeaModel {
    /**
     * <p>An array that consists of servers.</p>
     */
    @NameInMap("EntityList")
    public java.util.List<DescribeAllEntityResponseBodyEntityList> entityList;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>7E0618A9-D5EF-4220-9471-C42B5E92719F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAllEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllEntityResponseBody self = new DescribeAllEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAllEntityResponseBody setEntityList(java.util.List<DescribeAllEntityResponseBodyEntityList> entityList) {
        this.entityList = entityList;
        return this;
    }
    public java.util.List<DescribeAllEntityResponseBodyEntityList> getEntityList() {
        return this.entityList;
    }

    public DescribeAllEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAllEntityResponseBodyEntityList extends TeaModel {
        /**
         * <p>The ID of the asset group.</p>
         * 
         * <strong>example:</strong>
         * <p>281801</p>
         */
        @NameInMap("GroupId")
        public Integer groupId;

        /**
         * <p>The name of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>172.19.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>100.104.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>101.132.XX.XX</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The operating system of the server. Valid values:</p>
         * <ul>
         * <li><strong>linux</strong></li>
         * <li><strong>windows</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>windows</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <p>The UUID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>4fe8e1cd-3c37-4851-b9de-124da32c****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeAllEntityResponseBodyEntityList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllEntityResponseBodyEntityList self = new DescribeAllEntityResponseBodyEntityList();
            return TeaModel.build(map, self);
        }

        public DescribeAllEntityResponseBodyEntityList setGroupId(Integer groupId) {
            this.groupId = groupId;
            return this;
        }
        public Integer getGroupId() {
            return this.groupId;
        }

        public DescribeAllEntityResponseBodyEntityList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeAllEntityResponseBodyEntityList setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeAllEntityResponseBodyEntityList setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeAllEntityResponseBodyEntityList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeAllEntityResponseBodyEntityList setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public DescribeAllEntityResponseBodyEntityList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
