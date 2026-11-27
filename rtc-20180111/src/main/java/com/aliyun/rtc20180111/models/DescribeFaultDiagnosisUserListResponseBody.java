// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeFaultDiagnosisUserListResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>231470C1-ACFB-4C9F-844F-4CFE1E3804C5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCnt")
    public Integer totalCnt;

    /**
     * <p>The detailed list of users with faults.</p>
     */
    @NameInMap("UserList")
    public java.util.List<DescribeFaultDiagnosisUserListResponseBodyUserList> userList;

    public static DescribeFaultDiagnosisUserListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaultDiagnosisUserListResponseBody self = new DescribeFaultDiagnosisUserListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFaultDiagnosisUserListResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeFaultDiagnosisUserListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeFaultDiagnosisUserListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFaultDiagnosisUserListResponseBody setTotalCnt(Integer totalCnt) {
        this.totalCnt = totalCnt;
        return this;
    }
    public Integer getTotalCnt() {
        return this.totalCnt;
    }

    public DescribeFaultDiagnosisUserListResponseBody setUserList(java.util.List<DescribeFaultDiagnosisUserListResponseBodyUserList> userList) {
        this.userList = userList;
        return this;
    }
    public java.util.List<DescribeFaultDiagnosisUserListResponseBodyUserList> getUserList() {
        return this.userList;
    }

    public static class DescribeFaultDiagnosisUserListResponseBodyUserListFaultList extends TeaModel {
        /**
         * <p>The fault type.</p>
         * 
         * <strong>example:</strong>
         * <p>JOIN_SLOW</p>
         */
        @NameInMap("FaultType")
        public String faultType;

        public static DescribeFaultDiagnosisUserListResponseBodyUserListFaultList build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaultDiagnosisUserListResponseBodyUserListFaultList self = new DescribeFaultDiagnosisUserListResponseBodyUserListFaultList();
            return TeaModel.build(map, self);
        }

        public DescribeFaultDiagnosisUserListResponseBodyUserListFaultList setFaultType(String faultType) {
            this.faultType = faultType;
            return this;
        }
        public String getFaultType() {
            return this.faultType;
        }

    }

    public static class DescribeFaultDiagnosisUserListResponseBodyUserList extends TeaModel {
        /**
         * <p>The creation timestamp of the channel. The time is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1614936817</p>
         */
        @NameInMap("ChannelCreatedTs")
        public Long channelCreatedTs;

        /**
         * <p>The ID of the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>904</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <p>The time when the user first joined the channel. The time is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1614936817</p>
         */
        @NameInMap("CreatedTs")
        public Long createdTs;

        /**
         * <p>The time when the user last left the channel. The time is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1614936817</p>
         */
        @NameInMap("DestroyedTs")
        public Long destroyedTs;

        /**
         * <p>The list of faults.</p>
         */
        @NameInMap("FaultList")
        public java.util.List<DescribeFaultDiagnosisUserListResponseBodyUserListFaultList> faultList;

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>testuserid</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static DescribeFaultDiagnosisUserListResponseBodyUserList build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaultDiagnosisUserListResponseBodyUserList self = new DescribeFaultDiagnosisUserListResponseBodyUserList();
            return TeaModel.build(map, self);
        }

        public DescribeFaultDiagnosisUserListResponseBodyUserList setChannelCreatedTs(Long channelCreatedTs) {
            this.channelCreatedTs = channelCreatedTs;
            return this;
        }
        public Long getChannelCreatedTs() {
            return this.channelCreatedTs;
        }

        public DescribeFaultDiagnosisUserListResponseBodyUserList setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeFaultDiagnosisUserListResponseBodyUserList setCreatedTs(Long createdTs) {
            this.createdTs = createdTs;
            return this;
        }
        public Long getCreatedTs() {
            return this.createdTs;
        }

        public DescribeFaultDiagnosisUserListResponseBodyUserList setDestroyedTs(Long destroyedTs) {
            this.destroyedTs = destroyedTs;
            return this;
        }
        public Long getDestroyedTs() {
            return this.destroyedTs;
        }

        public DescribeFaultDiagnosisUserListResponseBodyUserList setFaultList(java.util.List<DescribeFaultDiagnosisUserListResponseBodyUserListFaultList> faultList) {
            this.faultList = faultList;
            return this;
        }
        public java.util.List<DescribeFaultDiagnosisUserListResponseBodyUserListFaultList> getFaultList() {
            return this.faultList;
        }

        public DescribeFaultDiagnosisUserListResponseBodyUserList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
