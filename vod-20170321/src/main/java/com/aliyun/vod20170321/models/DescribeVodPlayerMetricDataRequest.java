// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodPlayerMetricDataRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app-1000000</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The end time of the query. Format: yyyy-mm-ddthh:mm:ssz (UTC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-06-05T15:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The metric dimension filters. A dimension consists of a dimension type (Field), an operator (Op), and a dimension value.</p>
     * <blockquote>
     * <ul>
     * <li>A maximum of three dimensions can be specified.</li>
     * <li>When the Metrics parameter includes the following four metrics, Filters do not take effect: Uv (playback users), AvgPerVv (average plays per user), AvgPerPlayDuration (average play duration per user), and AvgPerCompletionVv (average completion plays per user).</li>
     * <li>For provinces and countries, pass the regionCode.</li>
     * <li>Separate multiple values with #_#.</li>
     * </ul>
     * </blockquote>
     * <p>Valid values for dimension type (Field):</p>
     * <ul>
     * <li>SdkVersion: SDK version.</li>
     * <li>AppVersion: app version.</li>
     * <li>Codec: codec.</li>
     * <li>VideoType: video format.</li>
     * <li>Network: network type.</li>
     * <li>Country: country.</li>
     * <li>Isp: ISP.</li>
     * <li>VideoDefinition: resolution.</li>
     * <li>Domain: domain name.</li>
     * <li>Province: province.</li>
     * <li>IsHw: whether hardware decoding is used.</li>
     * <li>ErrorCode: error code.</li>
     * </ul>
     * <p>Valid values for operator (Op): = (equal to), &gt; (greater than), &lt; (less than), and != (not equal to).</p>
     * <blockquote>
     * <ul>
     * <li>SdkVersion and VideoDefinition support all four operators. Other metrics support only = (equal to) and != (not equal to).</li>
     * </ul>
     * </blockquote>
     * <p>Retrieve dimension values by calling DescribeVodPlayerDimensionData.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *   {
     *     &quot;Field&quot;: &quot;codec&quot;,
     *     &quot;Op&quot;: &quot;=&quot;,
     *     &quot;Value&quot;: &quot;h265#<em>#h264&quot;
     *   },
     *   {
     *     &quot;Field&quot;: &quot;os&quot;,
     *     &quot;Op&quot;: &quot;=&quot;,
     *     &quot;Value&quot;: &quot;Android#</em>#iOS&quot;
     *   }
     * ]</p>
     */
    @NameInMap("Filters")
    public String filters;

    /**
     * <p>The time granularity for querying data. Valid values: <strong>5m</strong>, <strong>1h</strong>, and <strong>1d</strong>. The supported time granularity depends on the time span between <code>StartTime</code> and <code>EndTime</code>:</p>
     * <ul>
     * <li>Within 3 days: <strong>5m</strong>, <strong>1h</strong>, and <strong>1d</strong>.</li>
     * <li>4 to 7 days: <strong>1h</strong> and <strong>1d</strong>.</li>
     * <li>More than 7 days: <strong>1d</strong>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1d</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (<strong>default</strong>): Simplified Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The metric types. You can select multiple metrics (up to 3).</p>
     * <blockquote>
     * <ul>
     * <li>Percentage data is returned in decimal form.</li>
     * </ul>
     * </blockquote>
     * <p>Quality of Service (QoS) metrics:</p>
     * <ul>
     * <li>Vv: play count.</li>
     * <li>RealVv: actual play count.</li>
     * <li>FirstFrame: first frame time.</li>
     * <li>SecondPlayRate: instant play rate.</li>
     * <li>SlowPlayRate: slow play rate.</li>
     * <li>StuckCountRate: stuttering rate by count.</li>
     * <li>SeekDuration: seek duration.</li>
     * <li>StuckDuration100s: stuttering duration per 100 seconds.</li>
     * <li>StuckCount100s: stuttering count per 100 seconds.</li>
     * <li>PlayFailRate: play failure rate.</li>
     * <li>SeedFailRate: non-play rate.</li>
     * <li>AvgPlayBitrate: average playback bitrate.</li>
     * <li>AvgStartBitrate: average start bitrate.</li>
     * <li>ErrorCount100s: error count per 100 seconds.</li>
     * </ul>
     * <p>Quality of Experience (QoE) metrics:</p>
     * <ul>
     * <li>Uv: playback users.</li>
     * <li>AvgPerVv: average plays per user.</li>
     * <li>AvgVideoDuration: average video duration.</li>
     * <li>AvgPerPlayDuration: average play duration per user.</li>
     * <li>AvgPerCompletionVv: average completion plays per user.</li>
     * <li>CompletionVv: completion count.</li>
     * <li>CompletionRate: completion rate.</li>
     * <li>AvgPlayDuration: average play duration.</li>
     * <li>JumpRate5s: 5-second bounce rate.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Vv,Uv,AvgPerVv</p>
     */
    @NameInMap("Metrics")
    public String metrics;

    /**
     * <p>The operating system of the player. Specify this parameter to perform a filtered query for playback data of a specific operating system. Valid values: <strong>Android</strong>, <strong>iOS</strong>, <strong>Harmony</strong>, <strong>Windows</strong>, <strong>MacOS</strong>, and <strong>Linux</strong>.
     * The available values vary by terminal type:</p>
     * <ul>
     * <li><strong>native</strong>: Android, iOS, Harmony.</li>
     * <li><strong>web</strong>: Android, iOS, Harmony, Windows, MacOs, Linux.</li>
     * </ul>
     * <p>Separate multiple values with #_#.</p>
     * 
     * <strong>example:</strong>
     * <p>Android、iOS、Windows</p>
     */
    @NameInMap("Os")
    public String os;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Default value: <strong>5000</strong>. Maximum value: <strong>5000</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>5000</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The start time of the query. Format: <i>yyyy-mm-dd</i>t<i>hh:mm:ss</i>z (UTC).</p>
     * <blockquote>
     * <ul>
     * <li>Supports querying playback data history for the past year.</li>
     * <li>The time range for a single query cannot exceed 31 days.</li>
     * <li>The time interval is left-closed and right-open [StartTime, EndTime).</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-06-24T00:55:06Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The terminal type. Valid values:</p>
     * <ul>
     * <li><strong>web</strong>: web.</li>
     * <li><strong>mobile</strong>: native.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>web</p>
     */
    @NameInMap("TerminalType")
    public String terminalType;

    /**
     * <p>Returns data for the top N items ranked by play count. If this parameter is not specified, data for all dimensions is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Top")
    public Long top;

    public static DescribeVodPlayerMetricDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodPlayerMetricDataRequest self = new DescribeVodPlayerMetricDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodPlayerMetricDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeVodPlayerMetricDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVodPlayerMetricDataRequest setFilters(String filters) {
        this.filters = filters;
        return this;
    }
    public String getFilters() {
        return this.filters;
    }

    public DescribeVodPlayerMetricDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeVodPlayerMetricDataRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public DescribeVodPlayerMetricDataRequest setMetrics(String metrics) {
        this.metrics = metrics;
        return this;
    }
    public String getMetrics() {
        return this.metrics;
    }

    public DescribeVodPlayerMetricDataRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public DescribeVodPlayerMetricDataRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVodPlayerMetricDataRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeVodPlayerMetricDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeVodPlayerMetricDataRequest setTerminalType(String terminalType) {
        this.terminalType = terminalType;
        return this;
    }
    public String getTerminalType() {
        return this.terminalType;
    }

    public DescribeVodPlayerMetricDataRequest setTop(Long top) {
        this.top = top;
        return this;
    }
    public Long getTop() {
        return this.top;
    }

}
