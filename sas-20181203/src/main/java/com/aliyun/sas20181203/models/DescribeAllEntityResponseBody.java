// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAllEntityResponseBody extends TeaModel {
    @NameInMap("EntityList")
    public java.util.List<DescribeAllEntityResponseBodyEntityList> entityList;

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
        @NameInMap("GroupId")
        public Integer groupId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Os")
        public String os;

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
