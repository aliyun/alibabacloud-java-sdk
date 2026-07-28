// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DescribeProfileResponseBody extends TeaModel {
    /**
     * <p>The profile text. This parameter is not yet supported.</p>
     * 
     * <strong>example:</strong>
     * <p>No Demo</p>
     */
    @NameInMap("Profile")
    public String profile;

    /**
     * <p>The profile summary.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;summary&quot;: {
     *       &quot;workloadGroup&quot;: &quot;normal&quot;,
     *       &quot;totalTime&quot;: &quot;16ms&quot;,
     *       &quot;totalTimeMs&quot;: 16,
     *       &quot;state&quot;: &quot;OK&quot;,
     *       &quot;queryId&quot;: &quot;8c7776d539f2426b-b0b654c7acc9bf8f&quot;,
     *       &quot;sql&quot;: &quot;SELECT * FROM demo_db.user_info WHERE status = 1&quot;
     *     },
     *     &quot;operators&quot;: [
     *       {
     *         &quot;pipeline&quot;: 0,
     *         &quot;frag&quot;: 0,
     *         &quot;skewRatio&quot;: 1,
     *         &quot;name&quot;: &quot;RESULT_SINK_OPERATOR&quot;,
     *         &quot;timePct&quot;: 0.34,
     *         &quot;inputRows&quot;: 4,
     *         &quot;execTimeAvgMs&quot;: 0.05
     *       },
     *       {
     *         &quot;pipeline&quot;: 0,
     *         &quot;frag&quot;: 0,
     *         &quot;name&quot;: &quot;OLAP_SCAN_OPERATOR(nereids_id=84. table_name=user_info(user_info))&quot;,
     *         &quot;timePct&quot;: 0,
     *         &quot;runtimeFilters&quot;: [
     *           &quot;RuntimeFilterInfo: sum , avg , max , min&quot;
     *         ],
     *         &quot;execTimeAvgMs&quot;: 0,
     *         &quot;table&quot;: &quot;demo_db.user_info&quot;
     *       }
     *     ],
     *     &quot;queryStats&quot;: {
     *       &quot;blockedOperators&quot;: 0,
     *       &quot;operatorCount&quot;: 2,
     *       &quot;spilledOperators&quot;: 0,
     *       &quot;fragmentCount&quot;: 2
     *     },
     *     &quot;fragments&quot;: [
     *       {
     *         &quot;pipelines&quot;: 1,
     *         &quot;instances&quot;: 1,
     *         &quot;execTimeMs&quot;: 0.05,
     *         &quot;id&quot;: 0
     *       },
     *       {
     *         &quot;pipelines&quot;: 0,
     *         &quot;instances&quot;: 0,
     *         &quot;execTimeMs&quot;: 0,
     *         &quot;id&quot;: 0
     *       }
     *     ],
     *     &quot;timeBreakdown&quot;: {
     *       &quot;schedule&quot;: &quot;4ms&quot;,
     *       &quot;parseSql&quot;: &quot;1ms&quot;,
     *       &quot;nereidsAnalysis&quot;: &quot;1ms&quot;,
     *       &quot;waitFetchResult&quot;: &quot;5ms&quot;,
     *       &quot;fetchResult&quot;: &quot;1ms&quot;,
     *       &quot;nereidsOptimize&quot;: &quot;N/A&quot;,
     *       &quot;plan&quot;: &quot;6ms&quot;,
     *       &quot;nereidsRewrite&quot;: &quot;1ms&quot;
     *     },
     *     &quot;scannedTables&quot;: {
     *       &quot;demoDb.userInfo&quot;: {
     *         &quot;totalSizeGb&quot;: 0,
     *         &quot;totalRows&quot;: 5,
     *         &quot;tabletSkew&quot;: 1.6,
     *         &quot;ddl&quot;: &quot;CREATE TABLE <code>user_info</code> xxx&quot;,
     *         &quot;tablets&quot;: 8
     *       }
     *     }
     *   }</p>
     */
    @NameInMap("ProfileSummary")
    public Object profileSummary;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F8900A96-67F7-5274-A41B-7722E1ECF8C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeProfileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProfileResponseBody self = new DescribeProfileResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProfileResponseBody setProfile(String profile) {
        this.profile = profile;
        return this;
    }
    public String getProfile() {
        return this.profile;
    }

    public DescribeProfileResponseBody setProfileSummary(Object profileSummary) {
        this.profileSummary = profileSummary;
        return this;
    }
    public Object getProfileSummary() {
        return this.profileSummary;
    }

    public DescribeProfileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
