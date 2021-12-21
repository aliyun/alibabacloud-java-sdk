// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeFaultDiagnosisUserListResponseBody extends TeaModel {
    // 页码。
    @NameInMap("PageNo")
    public Integer pageNo;

    // 每页数量。
    @NameInMap("PageSize")
    public Integer pageSize;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    // 总数量。
    @NameInMap("TotalCnt")
    public Integer totalCnt;

    // 异常用户明细列表。
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
        // 异常类型 JOIN_SLOW：进频道慢 AUDIO_STUCK：音频卡顿 VIDEO_STUCK：视频卡顿 VIDEO_VAGUE：视频模糊 HIGH_DELAY：通话延迟高 FIRST_FRAME_SLOW：接收首屏慢
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
        // 通信的创建时间戳，使用UNIX时间戳表示，单位：秒。
        @NameInMap("ChannelCreatedTs")
        public Long channelCreatedTs;

        // 频道ID。
        @NameInMap("ChannelId")
        public String channelId;

        // 用户首次进入通话时间，使用UNIX时间戳表示，单位：秒。
        @NameInMap("CreatedTs")
        public Long createdTs;

        // 用户最后一次离开通话时间，使用UNIX时间戳表示，单位：秒。
        @NameInMap("DestroyedTs")
        public Long destroyedTs;

        // 异常列表。
        @NameInMap("FaultList")
        public java.util.List<DescribeFaultDiagnosisUserListResponseBodyUserListFaultList> faultList;

        // 用户ID。
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
