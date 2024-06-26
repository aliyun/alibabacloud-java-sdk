// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTimeZonesResponseBody extends TeaModel {
    /**
     * <p>DescribeTimeZones</p>
     * 
     * <strong>example:</strong>
     * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The description of the time zone.</p>
     */
    @NameInMap("TimeZones")
    public DescribeTimeZonesResponseBodyTimeZones timeZones;

    public static DescribeTimeZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTimeZonesResponseBody self = new DescribeTimeZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTimeZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTimeZonesResponseBody setTimeZones(DescribeTimeZonesResponseBodyTimeZones timeZones) {
        this.timeZones = timeZones;
        return this;
    }
    public DescribeTimeZonesResponseBodyTimeZones getTimeZones() {
        return this.timeZones;
    }

    public static class DescribeTimeZonesResponseBodyTimeZonesList extends TeaModel {
        /**
         * <p>Example 1</p>
         * 
         * <strong>example:</strong>
         * <p>(GMT+8:00) Asia/Shanghai</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The operation that you want to perform.<br>Set the value to <strong>DescribeTimeZones</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("TimeZone")
        public String timeZone;

        public static DescribeTimeZonesResponseBodyTimeZonesList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTimeZonesResponseBodyTimeZonesList self = new DescribeTimeZonesResponseBodyTimeZonesList();
            return TeaModel.build(map, self);
        }

        public DescribeTimeZonesResponseBodyTimeZonesList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeTimeZonesResponseBodyTimeZonesList setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

    public static class DescribeTimeZonesResponseBodyTimeZones extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("Default")
        public String _default;

        /**
         * <p>The list of time zones.</p>
         */
        @NameInMap("List")
        public java.util.List<DescribeTimeZonesResponseBodyTimeZonesList> list;

        public static DescribeTimeZonesResponseBodyTimeZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeTimeZonesResponseBodyTimeZones self = new DescribeTimeZonesResponseBodyTimeZones();
            return TeaModel.build(map, self);
        }

        public DescribeTimeZonesResponseBodyTimeZones set_default(String _default) {
            this._default = _default;
            return this;
        }
        public String get_default() {
            return this._default;
        }

        public DescribeTimeZonesResponseBodyTimeZones setList(java.util.List<DescribeTimeZonesResponseBodyTimeZonesList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<DescribeTimeZonesResponseBodyTimeZonesList> getList() {
            return this.list;
        }

    }

}
