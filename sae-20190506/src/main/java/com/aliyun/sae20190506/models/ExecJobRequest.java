// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ExecJobRequest extends TeaModel {
    /**
     * <p>The ID of the job template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ee1a7a07-abcb-4652-a1d3-2d57f415****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The image startup command. The command must be an executable object that exists in the container. Example:</p>
     * <pre><code>command:
     *       - echo
     *       - abc
     *       - &gt;
     *       - file0
     * </code></pre>
     * <p>Based on the preceding example, Command=&quot;echo&quot; and CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;].</p>
     * 
     * <strong>example:</strong>
     * <p>echo</p>
     */
    @NameInMap("Command")
    public String command;

    /**
     * <p>The arguments for the image startup command. These are the arguments required by the <strong>Command</strong> startup command. Format:</p>
     * <p><code>[&quot;a&quot;,&quot;b&quot;]</code></p>
     * <p>In the preceding example, CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]. The [&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;] part must be converted to a string in JSON array format. If this parameter is not required, leave it empty.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;a&quot;,&quot;b&quot;]</p>
     */
    @NameInMap("CommandArgs")
    public String commandArgs;

    /**
     * <p>The environment variables for the container. You can customize environment variables or reference configuration items. To reference a configuration item, you must first create a ConfigMap instance. For more information, see <a href="https://help.aliyun.com/document_detail/176914.html">CreateConfigMap</a>. Valid values:</p>
     * <ul>
     * <li>Custom configuration<ul>
     * <li><strong>name</strong>: the name of the environment variable.</li>
     * <li><strong>value</strong>: the value of the environment variable.</li>
     * </ul>
     * </li>
     * <li>Referenced configuration items<ul>
     * <li><strong>name</strong>: the name of the environment variable. You can reference a single key or all keys. To reference all keys, enter sae-sys-configmap-all-<configuration item name>, for example, sae-sys-configmap-all-test1.</li>
     * <li><strong>valueFrom</strong>: the reference of the environment variable. Set the value to configMapRef.</li>
     * <li><strong>configMapId</strong>: the ID of the configuration item.</li>
     * <li><strong>key</strong>: the key. If you reference all key-value pairs, do not set this field.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;envtmp&quot;,&quot;value&quot;:&quot;0&quot;}]</p>
     */
    @NameInMap("Envs")
    public String envs;

    /**
     * <p>The event ID. This parameter is user-defined and used for idempotence. Only one job is created for the same event ID.</p>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>The startup arguments for the JAR package job. Default job startup command:
     * <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code></p>
     * 
     * <strong>example:</strong>
     * <p>custom-args</p>
     */
    @NameInMap("JarStartArgs")
    public String jarStartArgs;

    /**
     * <p>The startup options for the JAR package job. Default job startup command:
     * <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArg</code></p>
     * 
     * <strong>example:</strong>
     * <p>-Xms4G -Xmx4G</p>
     */
    @NameInMap("JarStartOptions")
    public String jarStartOptions;

    /**
     * <p>The number of concurrent instances for the job.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Replicas")
    public String replicas;

    /**
     * <p>The time when the job is triggered. Format: <code>yyyy-MM-dd\\&quot;T\\&quot;HH:mm:ss\\&quot;Z\\&quot;</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-09-14T14:25:02Z</p>
     */
    @NameInMap("Time")
    public String time;

    /**
     * <p>The startup command for the WAR package deployment job. The configuration procedure is the same as that for the image deployment startup command. For more information, see <a href="https://help.aliyun.com/document_detail/96677.html">Configure a startup command</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>CATALINA_OPTS=\&quot;$CATALINA_OPTS $Options\&quot; catalina.sh run</p>
     */
    @NameInMap("WarStartOptions")
    public String warStartOptions;

    public static ExecJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecJobRequest self = new ExecJobRequest();
        return TeaModel.build(map, self);
    }

    public ExecJobRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ExecJobRequest setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public ExecJobRequest setCommandArgs(String commandArgs) {
        this.commandArgs = commandArgs;
        return this;
    }
    public String getCommandArgs() {
        return this.commandArgs;
    }

    public ExecJobRequest setEnvs(String envs) {
        this.envs = envs;
        return this;
    }
    public String getEnvs() {
        return this.envs;
    }

    public ExecJobRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public ExecJobRequest setJarStartArgs(String jarStartArgs) {
        this.jarStartArgs = jarStartArgs;
        return this;
    }
    public String getJarStartArgs() {
        return this.jarStartArgs;
    }

    public ExecJobRequest setJarStartOptions(String jarStartOptions) {
        this.jarStartOptions = jarStartOptions;
        return this;
    }
    public String getJarStartOptions() {
        return this.jarStartOptions;
    }

    public ExecJobRequest setReplicas(String replicas) {
        this.replicas = replicas;
        return this;
    }
    public String getReplicas() {
        return this.replicas;
    }

    public ExecJobRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public ExecJobRequest setWarStartOptions(String warStartOptions) {
        this.warStartOptions = warStartOptions;
        return this;
    }
    public String getWarStartOptions() {
        return this.warStartOptions;
    }

}
