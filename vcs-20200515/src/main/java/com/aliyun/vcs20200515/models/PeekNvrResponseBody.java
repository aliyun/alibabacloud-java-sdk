// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class PeekNvrResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public PeekNvrResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static PeekNvrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PeekNvrResponseBody self = new PeekNvrResponseBody();
        return TeaModel.build(map, self);
    }

    public PeekNvrResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PeekNvrResponseBody setData(PeekNvrResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PeekNvrResponseBodyData getData() {
        return this.data;
    }

    public PeekNvrResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PeekNvrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PeekNvrResponseBodyDataSubDeviceList extends TeaModel {
        @NameInMap("AssociatedPlatform")
        public String associatedPlatform;

        @NameInMap("SubDeviceId")
        public String subDeviceId;

        @NameInMap("SubDeviceName")
        public String subDeviceName;

        @NameInMap("SubDeviceNum")
        public String subDeviceNum;

        @NameInMap("SubDeviceStatus")
        public String subDeviceStatus;

        public static PeekNvrResponseBodyDataSubDeviceList build(java.util.Map<String, ?> map) throws Exception {
            PeekNvrResponseBodyDataSubDeviceList self = new PeekNvrResponseBodyDataSubDeviceList();
            return TeaModel.build(map, self);
        }

        public PeekNvrResponseBodyDataSubDeviceList setAssociatedPlatform(String associatedPlatform) {
            this.associatedPlatform = associatedPlatform;
            return this;
        }
        public String getAssociatedPlatform() {
            return this.associatedPlatform;
        }

        public PeekNvrResponseBodyDataSubDeviceList setSubDeviceId(String subDeviceId) {
            this.subDeviceId = subDeviceId;
            return this;
        }
        public String getSubDeviceId() {
            return this.subDeviceId;
        }

        public PeekNvrResponseBodyDataSubDeviceList setSubDeviceName(String subDeviceName) {
            this.subDeviceName = subDeviceName;
            return this;
        }
        public String getSubDeviceName() {
            return this.subDeviceName;
        }

        public PeekNvrResponseBodyDataSubDeviceList setSubDeviceNum(String subDeviceNum) {
            this.subDeviceNum = subDeviceNum;
            return this;
        }
        public String getSubDeviceNum() {
            return this.subDeviceNum;
        }

        public PeekNvrResponseBodyDataSubDeviceList setSubDeviceStatus(String subDeviceStatus) {
            this.subDeviceStatus = subDeviceStatus;
            return this;
        }
        public String getSubDeviceStatus() {
            return this.subDeviceStatus;
        }

    }

    public static class PeekNvrResponseBodyData extends TeaModel {
        @NameInMap("IdleCount")
        public Long idleCount;

        @NameInMap("SubDeviceList")
        public java.util.List<PeekNvrResponseBodyDataSubDeviceList> subDeviceList;

        public static PeekNvrResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PeekNvrResponseBodyData self = new PeekNvrResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PeekNvrResponseBodyData setIdleCount(Long idleCount) {
            this.idleCount = idleCount;
            return this;
        }
        public Long getIdleCount() {
            return this.idleCount;
        }

        public PeekNvrResponseBodyData setSubDeviceList(java.util.List<PeekNvrResponseBodyDataSubDeviceList> subDeviceList) {
            this.subDeviceList = subDeviceList;
            return this;
        }
        public java.util.List<PeekNvrResponseBodyDataSubDeviceList> getSubDeviceList() {
            return this.subDeviceList;
        }

    }

}
