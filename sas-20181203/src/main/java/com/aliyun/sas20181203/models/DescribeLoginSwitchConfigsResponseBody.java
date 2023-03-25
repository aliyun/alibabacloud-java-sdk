// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeLoginSwitchConfigsResponseBody extends TeaModel {
    /**
     * <p>The configuration item returned.</p>
     */
    @NameInMap("ConfigList")
    public java.util.List<DescribeLoginSwitchConfigsResponseBodyConfigList> configList;

    /**
     * <p>The number of returned configuration items.</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLoginSwitchConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoginSwitchConfigsResponseBody self = new DescribeLoginSwitchConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLoginSwitchConfigsResponseBody setConfigList(java.util.List<DescribeLoginSwitchConfigsResponseBodyConfigList> configList) {
        this.configList = configList;
        return this;
    }
    public java.util.List<DescribeLoginSwitchConfigsResponseBodyConfigList> getConfigList() {
        return this.configList;
    }

    public DescribeLoginSwitchConfigsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeLoginSwitchConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLoginSwitchConfigsResponseBodyConfigList extends TeaModel {
        /**
         * <p>The type of the alert that you enabled or disabled. Valid values:</p>
         * <br>
         * <p>*   **login\_common_ip**: alerts for unapproved logon IP addresses</p>
         * <p>*   **login\_common_time**: alerts for unapproved logon time ranges</p>
         * <p>*   **login\_common_account**: alerts for unapproved logon accounts</p>
         */
        @NameInMap("Item")
        public String item;

        /**
         * <p>The status of the Log Service feature. Valid values:</p>
         * <br>
         * <p>*   **0**: The feature is disabled.</p>
         * <p>*   **1**: The feature is enabled.</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static DescribeLoginSwitchConfigsResponseBodyConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoginSwitchConfigsResponseBodyConfigList self = new DescribeLoginSwitchConfigsResponseBodyConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeLoginSwitchConfigsResponseBodyConfigList setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public DescribeLoginSwitchConfigsResponseBodyConfigList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
