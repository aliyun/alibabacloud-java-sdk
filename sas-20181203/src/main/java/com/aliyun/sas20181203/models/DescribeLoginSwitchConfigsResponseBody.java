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
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>0B48AB3C-84FC-424D-A01D-B9270EF4****</p>
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
         * <ul>
         * <li><strong>login_common_ip</strong>: alerts for unapproved logon IP addresses</li>
         * <li><strong>login_common_time</strong>: alerts for unapproved logon time ranges</li>
         * <li><strong>login_common_account</strong>: alerts for unapproved logon accounts</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>login_common_ip</p>
         */
        @NameInMap("Item")
        public String item;

        /**
         * <p>The status of the Log Service feature. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The feature is disabled.</li>
         * <li><strong>1</strong>: The feature is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
