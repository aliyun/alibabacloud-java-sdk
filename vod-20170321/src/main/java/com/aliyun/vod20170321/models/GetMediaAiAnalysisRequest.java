// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaAiAnalysisRequest extends TeaModel {
    /**
     * <p>The expiration time of the image access URL. Unit: seconds.</p>
     * <ul>
     * <li>If OutputType is set to cdn:<ul>
     * <li>Only image URLs with URL authentication enabled expire. Otherwise, the URLs are permanently valid.</li>
     * <li>Minimum value: 1.</li>
     * <li>Maximum value: unlimited.</li>
     * <li>Default value: If this parameter is not specified, the default validity period specified in URL authentication settings is used.</li>
     * </ul>
     * </li>
     * <li>If OutputType is set to oss:<ul>
     * <li>Only image URLs with private storage permissions expire. Otherwise, the URLs are permanently valid.</li>
     * <li>Minimum value: 1.</li>
     * <li>Maximum value: To reduce security risks to the origin server, the maximum value is <strong>2592000</strong> (30 days) if images are stored in a bucket managed by ApsaraVideo VOD, and <strong>129600</strong> (36 hours) if images are stored in your own OSS bucket.</li>
     * <li>Default value: If this parameter is not specified, the value is 3600.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("AuthTimeout")
    public String authTimeout;

    /**
     * <p>The audio ID. You can query the audio ID in the ApsaraVideo VOD console or obtain it from the response of the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>006204a11bb386bb25491f95f****</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The type of the output URL. Valid values:</p>
     * <ul>
     * <li><strong>oss</strong>: back-to-origin URL.</li>
     * <li><strong>cdn</strong> (default): accelerated URL.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cdn</p>
     */
    @NameInMap("OutputType")
    public String outputType;

    /**
     * <p>The type of analysis results. Separate multiple types with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>Chapter</p>
     */
    @NameInMap("ResultTypes")
    public String resultTypes;

    public static GetMediaAiAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMediaAiAnalysisRequest self = new GetMediaAiAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public GetMediaAiAnalysisRequest setAuthTimeout(String authTimeout) {
        this.authTimeout = authTimeout;
        return this;
    }
    public String getAuthTimeout() {
        return this.authTimeout;
    }

    public GetMediaAiAnalysisRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public GetMediaAiAnalysisRequest setOutputType(String outputType) {
        this.outputType = outputType;
        return this;
    }
    public String getOutputType() {
        return this.outputType;
    }

    public GetMediaAiAnalysisRequest setResultTypes(String resultTypes) {
        this.resultTypes = resultTypes;
        return this;
    }
    public String getResultTypes() {
        return this.resultTypes;
    }

}
