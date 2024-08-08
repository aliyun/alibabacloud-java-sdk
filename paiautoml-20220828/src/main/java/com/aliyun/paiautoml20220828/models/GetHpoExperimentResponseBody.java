// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class GetHpoExperimentResponseBody extends TeaModel {
    /**
     * <p>Accessibility of expriment, public or private.</p>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>Error when the API call is not success.</p>
     * 
     * <strong>example:</strong>
     * <p>INVALID_INPUT_PARAMS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Experiment run environment configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>[odps_config]
     * access_id=foo
     * access_key=bar
     * end_point=<a href="http://service.odps.aliyun.com/api">http://service.odps.aliyun.com/api</a>
     * log_view_host=<a href="http://logview.odps.aliyun.com">http://logview.odps.aliyun.com</a>
     * project_name=my_project</p>
     */
    @NameInMap("ConfigIni")
    public String configIni;

    /**
     * <p>HPO search config yaml.</p>
     * 
     * <strong>example:</strong>
     * <p>assessor:
     *   classArgs:
     *     optimize_mode: maximize
     *     start_step: 1
     *   name: PAIAssessor
     * debug: true
     * experimentName: maxcompute_kmeans_monitor
     * experimentWorkingDirectory: ../expdir
     * logLevel: debug
     * maxTrialNumber: 10
     * searchSpaceFile: search_space.json
     * trainingService:
     *   platform: local
     * trialCommand: python3 -m hpo_tools.core.utils.run --config=./config.ini
     * trialConcurrency: 2
     * tuner:
     *   classArgs:
     *     optimize_mode: maximize
     *   name: TPE</p>
     */
    @NameInMap("ConfigYml")
    public String configYml;

    /**
     * <p>The one who created the experiment.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("Creator")
    public String creator;

    /**
     * <p>If the Experiment if deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Deleted")
    public Boolean deleted;

    /**
     * <p>Description of the experiment.</p>
     * 
     * <strong>example:</strong>
     * <p>This is experiment is for tune the LR of model.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Extra error message info.</p>
     * 
     * <strong>example:</strong>
     * <p>TBD</p>
     */
    @NameInMap("Detail")
    public java.util.Map<String, ?> detail;

    /**
     * <p>Experiment ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sX5O9Q8</p>
     */
    @NameInMap("ExperimentId")
    public String experimentId;

    /**
     * <p>Experiment create time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-01 08:30:11</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>Experiment last update time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-01 08:30:11</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>Experiment configuration in json format.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;output_config&quot;: {
     *         &quot;model_path&quot;: &quot;bi_ps_${exp_id}<em>${trial_id}&quot;
     *     },
     *     &quot;platform_config&quot;: {
     *         &quot;cmd&quot;: [
     *             &quot;PAI -name ps_smart\n    -project foo&quot;,
     *             &quot;PAI -name prediction\n    -project foo&quot;,
     *             &quot;PAI -name evaluate -project foo&quot;,
     *             &quot;INSERT OVERWRITE TABLE my_table;&quot;
     *         ],
     *         &quot;name&quot;: &quot;MaxCompute&quot;
     *     },
     *     &quot;metric_config&quot;: {
     *         &quot;metric_dict&quot;: {
     *             &quot;recall&quot;: 0.5,
     *             &quot;auc&quot;: 0.25,
     *             &quot;precision&quot;: 0.25
     *         },
     *         &quot;metric_source&quot;: [
     *             &quot;select * from my_metrics where pt=\&quot;${exp_id}</em>${trial_id}\&quot;;&quot;
     *         ],
     *         &quot;metric_type&quot;: &quot;table&quot;,
     *         &quot;final_mode&quot;: &quot;best&quot;
     *     },
     *     &quot;odps_config&quot;: {
     *         &quot;project_name&quot;: &quot;my_project&quot;,
     *         &quot;role_arn&quot;: &quot;acs:ram::123456789:role/aliyunserviceroleforfoo&quot;,
     *         &quot;region&quot;: &quot;cn-shanghai&quot;,
     *         &quot;end_point&quot;: &quot;<a href="http://service.cn.maxcompute.aliyun-inc.com/api">http://service.cn.maxcompute.aliyun-inc.com/api</a>&quot;,
     *         &quot;log_view_host&quot;: &quot;<a href="http://logview.odps.aliyun.com">http://logview.odps.aliyun.com</a>&quot;
     *     },
     *     &quot;yml_config&quot;: {
     *         &quot;max_trial_number&quot;: 5,
     *         &quot;assessor&quot;: {
     *             &quot;name&quot;: &quot;PAIAssessor&quot;,
     *             &quot;class_args&quot;: {
     *                 &quot;earlystop&quot;: true,
     *                 &quot;start_step&quot;: 5,
     *                 &quot;optimize_mode&quot;: &quot;maximize&quot;
     *             }
     *         },
     *         &quot;experiment_name&quot;: &quot;my_exp&quot;,
     *         &quot;tuner&quot;: {
     *             &quot;name&quot;: &quot;TPE&quot;,
     *             &quot;class_args&quot;: {
     *                 &quot;optimize_mode&quot;: &quot;maximize&quot;
     *             }
     *         },
     *         &quot;trial_concurrency&quot;: 2
     *     },
     *     &quot;search_space&quot;: {
     *         &quot;${max_depth}&quot;: {
     *             &quot;_type&quot;: &quot;choice&quot;,
     *             &quot;_value&quot;: [
     *                 1,
     *                 3,
     *                 5
     *             ]
     *         },
     *         &quot;${tree_count}&quot;: {
     *             &quot;_value&quot;: [
     *                 50,
     *                 100,
     *                 150
     *             ],
     *             &quot;_type&quot;: &quot;choice&quot;
     *         }
     *     }
     * }</p>
     */
    @NameInMap("HpoExperimentConfiguration")
    public java.util.Map<String, ?> hpoExperimentConfiguration;

    /**
     * <p>Experiment  Job type.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>Error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Missing \&quot;user_id\&quot; in request.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Experiment name.</p>
     * 
     * <strong>example:</strong>
     * <p>my_hpo_exp_1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3F190916-B3E5-5D1E-AD0C-35C0DF105F51</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>HPO hyperparameter search space.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;${centerCount}&quot;:{&quot;_type&quot;:&quot;choice&quot;,&quot;_value&quot;:[2,3,4,5]},&quot;${distanceType}&quot;:{&quot;_type&quot;:&quot;choice&quot;,&quot;_value&quot;:[&quot;euclidean&quot;,&quot;cosine&quot;,&quot;cityblock&quot;]}}</p>
     */
    @NameInMap("SearchSpace")
    public String searchSpace;

    /**
     * <p>Experiment status.</p>
     * 
     * <strong>example:</strong>
     * <p>INVALID_USER_OR_EXP, SUCCESS, or EXECUTION_FAILURE</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Trials amount run till now.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TrialCount")
    public Integer trialCount;

    /**
     * <p>Status if a trial</p>
     */
    @NameInMap("TrialStatus")
    public java.util.Map<String, String> trialStatus;

    /**
     * <p>AI Workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetHpoExperimentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHpoExperimentResponseBody self = new GetHpoExperimentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHpoExperimentResponseBody setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public GetHpoExperimentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHpoExperimentResponseBody setConfigIni(String configIni) {
        this.configIni = configIni;
        return this;
    }
    public String getConfigIni() {
        return this.configIni;
    }

    public GetHpoExperimentResponseBody setConfigYml(String configYml) {
        this.configYml = configYml;
        return this;
    }
    public String getConfigYml() {
        return this.configYml;
    }

    public GetHpoExperimentResponseBody setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public GetHpoExperimentResponseBody setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    public Boolean getDeleted() {
        return this.deleted;
    }

    public GetHpoExperimentResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetHpoExperimentResponseBody setDetail(java.util.Map<String, ?> detail) {
        this.detail = detail;
        return this;
    }
    public java.util.Map<String, ?> getDetail() {
        return this.detail;
    }

    public GetHpoExperimentResponseBody setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public GetHpoExperimentResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetHpoExperimentResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetHpoExperimentResponseBody setHpoExperimentConfiguration(java.util.Map<String, ?> hpoExperimentConfiguration) {
        this.hpoExperimentConfiguration = hpoExperimentConfiguration;
        return this;
    }
    public java.util.Map<String, ?> getHpoExperimentConfiguration() {
        return this.hpoExperimentConfiguration;
    }

    public GetHpoExperimentResponseBody setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public GetHpoExperimentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHpoExperimentResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetHpoExperimentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHpoExperimentResponseBody setSearchSpace(String searchSpace) {
        this.searchSpace = searchSpace;
        return this;
    }
    public String getSearchSpace() {
        return this.searchSpace;
    }

    public GetHpoExperimentResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetHpoExperimentResponseBody setTrialCount(Integer trialCount) {
        this.trialCount = trialCount;
        return this;
    }
    public Integer getTrialCount() {
        return this.trialCount;
    }

    public GetHpoExperimentResponseBody setTrialStatus(java.util.Map<String, String> trialStatus) {
        this.trialStatus = trialStatus;
        return this;
    }
    public java.util.Map<String, String> getTrialStatus() {
        return this.trialStatus;
    }

    public GetHpoExperimentResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
