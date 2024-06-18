// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCollationTimeZonesResponseBody extends TeaModel {
    /**
     * <p>The list of the character set collations and time zones that are available.</p>
     */
    @NameInMap("CollationTimeZones")
    public DescribeCollationTimeZonesResponseBodyCollationTimeZones collationTimeZones;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4EAED246-DB18-4C8D-9EB5-C319626F2A77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCollationTimeZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCollationTimeZonesResponseBody self = new DescribeCollationTimeZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCollationTimeZonesResponseBody setCollationTimeZones(DescribeCollationTimeZonesResponseBodyCollationTimeZones collationTimeZones) {
        this.collationTimeZones = collationTimeZones;
        return this;
    }
    public DescribeCollationTimeZonesResponseBodyCollationTimeZones getCollationTimeZones() {
        return this.collationTimeZones;
    }

    public DescribeCollationTimeZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCollationTimeZonesResponseBodyCollationTimeZonesCollationTimeZone extends TeaModel {
        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Kabul</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The offset of the UTC time. The offset is in the following format: (UTC+<em>HH:mm</em>).</p>
         * 
         * <strong>example:</strong>
         * <p>(UTC+04:30)</p>
         */
        @NameInMap("StandardTimeOffset")
        public String standardTimeOffset;

        /**
         * <p>The time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>Afghanistan Standard Time</p>
         */
        @NameInMap("TimeZone")
        public String timeZone;

        public static DescribeCollationTimeZonesResponseBodyCollationTimeZonesCollationTimeZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeCollationTimeZonesResponseBodyCollationTimeZonesCollationTimeZone self = new DescribeCollationTimeZonesResponseBodyCollationTimeZonesCollationTimeZone();
            return TeaModel.build(map, self);
        }

        public DescribeCollationTimeZonesResponseBodyCollationTimeZonesCollationTimeZone setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCollationTimeZonesResponseBodyCollationTimeZonesCollationTimeZone setStandardTimeOffset(String standardTimeOffset) {
            this.standardTimeOffset = standardTimeOffset;
            return this;
        }
        public String getStandardTimeOffset() {
            return this.standardTimeOffset;
        }

        public DescribeCollationTimeZonesResponseBodyCollationTimeZonesCollationTimeZone setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

    public static class DescribeCollationTimeZonesResponseBodyCollationTimeZones extends TeaModel {
        @NameInMap("CollationTimeZone")
        public java.util.List<DescribeCollationTimeZonesResponseBodyCollationTimeZonesCollationTimeZone> collationTimeZone;

        public static DescribeCollationTimeZonesResponseBodyCollationTimeZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeCollationTimeZonesResponseBodyCollationTimeZones self = new DescribeCollationTimeZonesResponseBodyCollationTimeZones();
            return TeaModel.build(map, self);
        }

        public DescribeCollationTimeZonesResponseBodyCollationTimeZones setCollationTimeZone(java.util.List<DescribeCollationTimeZonesResponseBodyCollationTimeZonesCollationTimeZone> collationTimeZone) {
            this.collationTimeZone = collationTimeZone;
            return this;
        }
        public java.util.List<DescribeCollationTimeZonesResponseBodyCollationTimeZonesCollationTimeZone> getCollationTimeZone() {
            return this.collationTimeZone;
        }

    }

}
