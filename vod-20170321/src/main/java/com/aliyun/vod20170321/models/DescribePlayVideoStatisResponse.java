// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribePlayVideoStatisResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VideoPlayStatisDetails")
    @Validation(required = true)
    public DescribePlayVideoStatisResponseVideoPlayStatisDetails videoPlayStatisDetails;

    public static DescribePlayVideoStatisResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayVideoStatisResponse self = new DescribePlayVideoStatisResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribePlayVideoStatisResponseVideoPlayStatisDetailsVideoPlayStatisDetail extends TeaModel {
        @NameInMap("Date")
        @Validation(required = true)
        public String date;

        @NameInMap("PlayDuration")
        @Validation(required = true)
        public String playDuration;

        @NameInMap("VV")
        @Validation(required = true)
        public String VV;

        @NameInMap("UV")
        @Validation(required = true)
        public String UV;

        @NameInMap("PlayRange")
        @Validation(required = true)
        public String playRange;

        @NameInMap("Title")
        @Validation(required = true)
        public String title;

        public static DescribePlayVideoStatisResponseVideoPlayStatisDetailsVideoPlayStatisDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribePlayVideoStatisResponseVideoPlayStatisDetailsVideoPlayStatisDetail self = new DescribePlayVideoStatisResponseVideoPlayStatisDetailsVideoPlayStatisDetail();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribePlayVideoStatisResponseVideoPlayStatisDetails extends TeaModel {
        @NameInMap("VideoPlayStatisDetail")
        @Validation(required = true)
        public java.util.List<DescribePlayVideoStatisResponseVideoPlayStatisDetailsVideoPlayStatisDetail> videoPlayStatisDetail;

        public static DescribePlayVideoStatisResponseVideoPlayStatisDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribePlayVideoStatisResponseVideoPlayStatisDetails self = new DescribePlayVideoStatisResponseVideoPlayStatisDetails();
            return TeaModel.build(map, self);
        }

    }

}
