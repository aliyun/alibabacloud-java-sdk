// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class ListGlobalUserConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListGlobalUserConfigResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>D81DD78E-E006-5C65-A171-C8CB09XXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListGlobalUserConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGlobalUserConfigResponseBody self = new ListGlobalUserConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGlobalUserConfigResponseBody setData(java.util.List<ListGlobalUserConfigResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListGlobalUserConfigResponseBodyData> getData() {
        return this.data;
    }

    public ListGlobalUserConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListGlobalUserConfigResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("GlobalConfigSwitch")
        public Boolean globalConfigSwitch;

        /**
         * <strong>example:</strong>
         * <p>ransomware_breaking</p>
         */
        @NameInMap("ModuleName")
        public String moduleName;

        public static ListGlobalUserConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGlobalUserConfigResponseBodyData self = new ListGlobalUserConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGlobalUserConfigResponseBodyData setGlobalConfigSwitch(Boolean globalConfigSwitch) {
            this.globalConfigSwitch = globalConfigSwitch;
            return this;
        }
        public Boolean getGlobalConfigSwitch() {
            return this.globalConfigSwitch;
        }

        public ListGlobalUserConfigResponseBodyData setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

    }

}
