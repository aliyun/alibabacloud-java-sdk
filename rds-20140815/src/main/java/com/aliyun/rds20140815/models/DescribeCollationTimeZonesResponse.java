// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCollationTimeZonesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CollationTimeZones")
    @Validation(required = true)
    public DescribeCollationTimeZonesResponseCollationTimeZones collationTimeZones;

    public static DescribeCollationTimeZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCollationTimeZonesResponse self = new DescribeCollationTimeZonesResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeCollationTimeZonesResponseCollationTimeZonesCollationTimeZone extends TeaModel {
        @NameInMap("TimeZone")
        @Validation(required = true)
        public String timeZone;

        @NameInMap("StandardTimeOffset")
        @Validation(required = true)
        public String standardTimeOffset;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static DescribeCollationTimeZonesResponseCollationTimeZonesCollationTimeZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeCollationTimeZonesResponseCollationTimeZonesCollationTimeZone self = new DescribeCollationTimeZonesResponseCollationTimeZonesCollationTimeZone();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeCollationTimeZonesResponseCollationTimeZones extends TeaModel {
        @NameInMap("CollationTimeZone")
        @Validation(required = true)
        public java.util.List<DescribeCollationTimeZonesResponseCollationTimeZonesCollationTimeZone> collationTimeZone;

        public static DescribeCollationTimeZonesResponseCollationTimeZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeCollationTimeZonesResponseCollationTimeZones self = new DescribeCollationTimeZonesResponseCollationTimeZones();
            return TeaModel.build(map, self);
        }

    }

}
