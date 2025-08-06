// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMTSStatisResponseBody extends TeaModel {
    @NameInMap("MTSStatisBySpecList")
    public GetMTSStatisResponseBodyMTSStatisBySpecList MTSStatisBySpecList;

    @NameInMap("RequestId")
    public String requestId;

    public static GetMTSStatisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMTSStatisResponseBody self = new GetMTSStatisResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMTSStatisResponseBody setMTSStatisBySpecList(GetMTSStatisResponseBodyMTSStatisBySpecList MTSStatisBySpecList) {
        this.MTSStatisBySpecList = MTSStatisBySpecList;
        return this;
    }
    public GetMTSStatisResponseBodyMTSStatisBySpecList getMTSStatisBySpecList() {
        return this.MTSStatisBySpecList;
    }

    public GetMTSStatisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMTSStatisResponseBodyMTSStatisBySpecListMTSStatisBySpecMTSStatisDOListMTSStatisDO extends TeaModel {
        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Specification")
        public String specification;

        @NameInMap("StatTime")
        public String statTime;

        @NameInMap("StatTimeUTC")
        public String statTimeUTC;

        @NameInMap("UserId")
        public String userId;

        public static GetMTSStatisResponseBodyMTSStatisBySpecListMTSStatisBySpecMTSStatisDOListMTSStatisDO build(java.util.Map<String, ?> map) throws Exception {
            GetMTSStatisResponseBodyMTSStatisBySpecListMTSStatisBySpecMTSStatisDOListMTSStatisDO self = new GetMTSStatisResponseBodyMTSStatisBySpecListMTSStatisBySpecMTSStatisDOListMTSStatisDO();
            return TeaModel.build(map, self);
        }

        public GetMTSStatisResponseBodyMTSStatisBySpecListMTSStatisBySpecMTSStatisDOListMTSStatisDO setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetMTSStatisResponseBodyMTSStatisBySpecListMTSStatisBySpecMTSStatisDOListMTSStatisDO setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

        public GetMTSStatisResponseBodyMTSStatisBySpecListMTSStatisBySpecMTSStatisDOListMTSStatisDO setStatTime(String statTime) {
            this.statTime = statTime;
            return this;
        }
        public String getStatTime() {
            return this.statTime;
        }

        public GetMTSStatisResponseBodyMTSStatisBySpecListMTSStatisBySpecMTSStatisDOListMTSStatisDO setStatTimeUTC(String statTimeUTC) {
            this.statTimeUTC = statTimeUTC;
            return this;
        }
        public String getStatTimeUTC() {
            return this.statTimeUTC;
        }

        public GetMTSStatisResponseBodyMTSStatisBySpecListMTSStatisBySpecMTSStatisDOListMTSStatisDO setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetMTSStatisResponseBodyMTSStatisBySpecListMTSStatisBySpecMTSStatisDOList extends TeaModel {
        @NameInMap("MTSStatisDO")
        public java.util.List<GetMTSStatisResponseBodyMTSStatisBySpecListMTSStatisBySpecMTSStatisDOListMTSStatisDO> MTSStatisDO;

        public static GetMTSStatisResponseBodyMTSStatisBySpecListMTSStatisBySpecMTSStatisDOList build(java.util.Map<String, ?> map) throws Exception {
            GetMTSStatisResponseBodyMTSStatisBySpecListMTSStatisBySpecMTSStatisDOList self = new GetMTSStatisResponseBodyMTSStatisBySpecListMTSStatisBySpecMTSStatisDOList();
            return TeaModel.build(map, self);
        }

        public GetMTSStatisResponseBodyMTSStatisBySpecListMTSStatisBySpecMTSStatisDOList setMTSStatisDO(java.util.List<GetMTSStatisResponseBodyMTSStatisBySpecListMTSStatisBySpecMTSStatisDOListMTSStatisDO> MTSStatisDO) {
            this.MTSStatisDO = MTSStatisDO;
            return this;
        }
        public java.util.List<GetMTSStatisResponseBodyMTSStatisBySpecListMTSStatisBySpecMTSStatisDOListMTSStatisDO> getMTSStatisDO() {
            return this.MTSStatisDO;
        }

    }

    public static class GetMTSStatisResponseBodyMTSStatisBySpecListMTSStatisBySpec extends TeaModel {
        @NameInMap("MTSStatisDOList")
        public GetMTSStatisResponseBodyMTSStatisBySpecListMTSStatisBySpecMTSStatisDOList MTSStatisDOList;

        @NameInMap("Specification")
        public String specification;

        public static GetMTSStatisResponseBodyMTSStatisBySpecListMTSStatisBySpec build(java.util.Map<String, ?> map) throws Exception {
            GetMTSStatisResponseBodyMTSStatisBySpecListMTSStatisBySpec self = new GetMTSStatisResponseBodyMTSStatisBySpecListMTSStatisBySpec();
            return TeaModel.build(map, self);
        }

        public GetMTSStatisResponseBodyMTSStatisBySpecListMTSStatisBySpec setMTSStatisDOList(GetMTSStatisResponseBodyMTSStatisBySpecListMTSStatisBySpecMTSStatisDOList MTSStatisDOList) {
            this.MTSStatisDOList = MTSStatisDOList;
            return this;
        }
        public GetMTSStatisResponseBodyMTSStatisBySpecListMTSStatisBySpecMTSStatisDOList getMTSStatisDOList() {
            return this.MTSStatisDOList;
        }

        public GetMTSStatisResponseBodyMTSStatisBySpecListMTSStatisBySpec setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

    }

    public static class GetMTSStatisResponseBodyMTSStatisBySpecList extends TeaModel {
        @NameInMap("MTSStatisBySpec")
        public java.util.List<GetMTSStatisResponseBodyMTSStatisBySpecListMTSStatisBySpec> MTSStatisBySpec;

        public static GetMTSStatisResponseBodyMTSStatisBySpecList build(java.util.Map<String, ?> map) throws Exception {
            GetMTSStatisResponseBodyMTSStatisBySpecList self = new GetMTSStatisResponseBodyMTSStatisBySpecList();
            return TeaModel.build(map, self);
        }

        public GetMTSStatisResponseBodyMTSStatisBySpecList setMTSStatisBySpec(java.util.List<GetMTSStatisResponseBodyMTSStatisBySpecListMTSStatisBySpec> MTSStatisBySpec) {
            this.MTSStatisBySpec = MTSStatisBySpec;
            return this;
        }
        public java.util.List<GetMTSStatisResponseBodyMTSStatisBySpecListMTSStatisBySpec> getMTSStatisBySpec() {
            return this.MTSStatisBySpec;
        }

    }

}
