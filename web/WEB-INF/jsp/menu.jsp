<%-- 
    Document   : menu
    Created on : Feb 13, 2017, 10:39:45 PM
    Author     : tris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   
    <head>
  <meta charset="UTF-8">
  <title>Fluid menu with transparent icons</title>
  
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css">

  
      <style>
      /* NOTE: The styles were added inline because Prefixfree needs access to your styles and they must be inlined if they are on local disk! */
      @import url(http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300);
html{
  height:100%;
}
body{
  text-align:center;
  background:url('http://one-div.com/codepen/menu/bg.jpg')no-repeat;
  	-webkit-background-size: cover;
	-moz-background-size: cover;
	background-size: cover;
  background-position:50% 50%;
  height:100%;
  font-family: 'Open Sans Condensed', sans-serif;
}
body:before {
	content: "";
	height: 100%;
	display: inline-block;
	vertical-align: middle;
}

#menu{
	display: inline-block;
  height:135px;
  width:80%;
	vertical-align: middle;
  white-space: nowrap;
}
#menu li {
position: relative;
z-index: 2;
display: block;
float: left;
width: 15%;
height: 135px;
line-height: 220px;
margin-right: 1.42857%;
white-space: nowrap;
background-position: 50%;
}
.rocket {
background: url('https://lh3.googleusercontent.com/Qo4FbE3z1qn9r-TBW-OojwFcbA28dk3Gppchh_hI6isZP_qJRCloEzHq2adrItSJTmZsci6guprSxK5KiEv5maFb-Iw2nXtvuNZdxgOQlUeIYSrDCfQej42EVsxl9HggTPaT3jyFQbhuQ4VFzS7K9ztk2U3eeCgI638ldyH8H7CMdrgRAlhclT2Qy6tuBk6IixYIuc4N7Yru42N6fEtZQnF0wEZPTfnQkSOOY0_BNXzFTjBa5dRz0DIF71-2gx_Z2o29xiNDM0BErKNQFCz8-w62fTbCAfr3dcZJS0mV3Apfgq520b8Buuar3i5zrk8eZa3rPR-Eq_npQjPETtG4BFTlwvEwUrBGtusnGjWAAJFx5q6VHx9WbaPtZtKRbTjYT7wVPSfq2ZJRlJI6FjxX-uoo1efvjUzaSTTQbgD2M5PCyJrmlCGfALlaSFJKmyMu4Sg3QYI3SytCfodhiO0cccqnU7296vbTRbYabNwZGTJUJzrxC1g91X9IXS9H0D5aIgLActHY0dIpXBbZJmVUil2wdSAtO1rtnv2Un0baeSrX5bUBT-zOyuN8nGeniox2hdNfamxCjnXTkCOUO6QFnoDs53LIkwXNGlMUxrgCuIMHX5GoTKP5=w300-h135-no')no-repeat;
margin-left: 1.42857%;
}
.wine{
  background:url('https://lh3.googleusercontent.com/bkioYJX1KQ7Lxem2hySwmahnylKuuoOOs3Jt4tApS9PvNjsbwl01AGTyGGIlNpi73ZEEg8JDldT2bZBhuWGKeauMThjGw1LaUDNVqFQv7gukgkeM8rfrn9JGcEfLIy_RLogJdeZ245pH2KyFCx41_DZNaNfW8IKvtAp0o7fvUAnNLuMXrkpSrfYRf2Ic0pF1ikhhlK4m8SEBlQEhY91ygrv5-fZbW_L1JK3iPb26jLVvK53A1Kkl5DfBjvvX2MqpBT2Yuwi8vLO_1gnKZvro_uOmvuwQDqjtr2OYRUfJZZY2aQ0Sm_4OZwF5NlE0mrar34TvlglMm__-WELmGiGEZr3ZyloFTpji3kPkZNDmEk9ehCYBoi5JtXcL4hbYKarX4lhdyww3kR_J1tl6VOP5crCEe3uwG2VOk2y5EliR5VdupN5s9IO2eiEqxKij6R4urg1oDDcWjm5uIqC62YvXktNQB8ywiEMFDCAASGHdbVawy7wzl98j1z-TIFLqBFTyte_d2N6nhsUnbeJRvlmlURjkct4MxCz671agWO4QtDB2fx6BBorDEUuZFIQO9f7aEK7wl8VYD-hd-WGAQZlEZIgqO6g9Ix-UOqZ9Hd5HKoOCfotrOoyP=w300-h135-no')no-repeat;  
}
.burger{
  background:url('https://lh3.googleusercontent.com/s4otlY7jvLBKfwlD6-_8C_HS8PNlT6P1kjNaG60OfCIEbWq2gno8un2afxK6frIV7CnUefwTQswfky4jzybOvi4KKhCSgl7pg5GLrfJEKrwya60taLcNNQfwunQg0_1rFAtgSDyBBlTTb0TzcqSkqa37tz-EnDbxLJTf7raCXcLRF7tsU0LeZl0pcGpAymQ3MikOoDF6R4DXgsUfOCVr8w5wDE_rhoz3HqEIYw7pniFgfCBm8Lx7I-84Bw8815lE6MKVrnLiUYBWXFWexPXdfbGnOny49N2DaubniOkO8GjJIxp0R66OY7I1iunRQULzXxSEym3L6YRN3j4EUt5gfN3ziFRhPDpssCLTvIe2_QVFrjn_FbOiNksYYt6EXphob9SaGz841qV98gAuc1c5EQTm_wcKOYYXnW3cea3tt3Ud5JklBpYpXt3YT1TognUc5gBNgwOtxClB5RylREU_pxruHQaFFP2rc8NCowCIJz9Sr4eyTE5ezF4CUDkfsWz6UKh6Nvdd0ROH28wDXr6S3eWY8e0LX5BrQyELqTvDMFaZgtXrBVuP5_ZwhbFwAXnecnhT1K9X3duXJ16DvEg9i4Zf8R7j2NDN9qIuMIa9Ny8ijWiwZAgl=w300-h135-no')no-repeat;
}
.comment{
  background:url('https://lh3.googleusercontent.com/tBSolMjeTERHbd-ba4t9Ng0FRyUqsntXv7jnqCmYMp5cR_V3N6aOfGE_yMruLAQEGgpLqRRP4ReCfVNRfBKnTusSICLSfX_lk1-jIm7run7ADmCvZsHhMqhEKr3Otbk_XP0j_R0Vf-ffSbJYC7JkUErQNraZHmNU5PRxAuYrDvl1sg8JlCI3vw0bFIbf6gP5yeMjRhBhzhVQG0LYZDQyA5_TocrBZZd3xId6jAq0OA11qArN91txI2Fx-tfltjDE84xltErbHnoZPAF0HiF6HAFKluu76DKGssovY5kgCfW0mKqtWTbGUjjjVSbuis-gK_Qh9nste3GgYGgXHNtwZ1odi5x_BymCVHhCmVqyqe7Bu7tqVBtwUoJTdkF0Tek_0kt-13D01IAaTDedKRjElbmNQheuzKg4rUx7-4hGzagzG0DRO40AlMh6FAf7KSmkIjmxHOSz1FJijq55a54WL3s44caDrD_O_3IZVZFGK9jZEjjCeC4vB4QpBY-DWSfL3m7RTac5S-pgKMo_SmvDf2wFrYX5GvyiWiBgSmOyVGc3sSpPw4J_GF5L0XS8cHYFg2AHGF6HAKHAbdfMYiAvJAa1mij0SiBY-5CoJbtG5rbAssBS2Tsa=w300-h135-no')no-repeat;
  
}
.sport{
  background:url('https://lh3.googleusercontent.com/kV4i9a7co9DhPI47ZNE6MWaChV1q7KkAVk90d9aLDAKNHCao5j64-GDxEnkZpsxAeP_YME6f2ESzOtLcWGz1ldODzb_ShAGhGB-imE_HQzr3ZF5993bRY5mTeXV6ugTnvzUVK54Wo1JFjQyjVDO1ffrDSjfo3vVCduYzqWnKJvj83Yk6J_qK0hIUz-DViEO9YHZU0g7O_I34Amm1WgcorCIt4iwDuJFrAk0_vxiy4Pz9RmKcMXm5ZZ_ZOU82BZewiKSppSnF0TOEjOYweh1Bbx_8QJ71JamyoJsYjAq63BTzpwqWOhOYUXzkgwXuxzy--BFQKSxvQaVwJZVttZwrTGQknaMij_htgm77zM0MDalK1_pMGzJCrwC0igF64L8NigIKqXblBnT5LEk1oOuLyooQ0pZuEJp7mymhL1cvajgM6TSFOfI6va1JoZn0NRYX7hScGCtGvpFU3uDi393LAtY3srs6gvpciaR-yAS63lZYsACa8VnvvnddSuJI4P6jRLtPVcrSGuQEjt_HtdueQao0f-FCbhBeWRYMT5oL3hr0ZCJiahouHQ9s-UN9yYBO1RG5QhFfSBiMnmzNOXH9qfNyWL-owOiIGQsU75Rpy5F3jZb429u4=w300-h135-no')no-repeat;
  
}
.earth{
  background:url('https://lh3.googleusercontent.com/c-vKzrRERq162pnCQ5XxdmOOi-qcC-lUMo-zaAjG_VC_xy2rqpukgg7v8udP7UPhaN_rrEnK9sXqR_A9Ti07DHtNleTFFyyn7RB0_SAGORGAOCOZNY7Nz53MKgrOIl2v7dt4fiYuJarH-G9UUbx95d1NmDDz79m0czqBCo8ipy5Q5f6VVQ8NNV5xGN8MlMgsxfhj8QwpFYgIAEk_phqQPKDqiqXUw-qLNEN66hFeCWHmYoQ5EzwRAt3wDEmKm2pyv1EfhTFk_ZS-XcVtE_jxNF_tBR9fKx4mS_CpACMT4CCh_DLqDqFURuXS7VJww5-7OkMBDWpoS326vIYVq7RIrm3UF9MEF38bA8O2vBTQFFQyqWRIRc0VtxVVhXieTBVgc8JNpWhVp_XKq5NM2WHTPDVgxXObvpBUeqQ2_xhnA9haymwQibTabi7L4Ho1pvXeCRcNygEcjdfpEKSgYLUizN1ECdIuALOJk7-ZwHz5YqQRIqNDiKN5m0vUGbxN_gyCrsJJpu84spw4IlA7uQqUEfz4lK2c106oz0RbQ8CIOaHpSNK7h5lisBGvFn9aPDruQfejRELL2GDgFT3lxjpsfhvHWYjJudTbt5UCSN68W6f6-PDfpIG4=w300-h135-no')no-repeat;  
}
#menu ul{
  position:relative;
}
#menu ul:after{
  content:"";
  display:block;
  clear:both;
}
#menu a{
  color:#D8D8D8;
  text-decoration:none;
  display:block;
  width:100%;
  height:100%;
  text-shadow: 0 -1px 0 #000;
}
#menu li:after {
content: "";
width: 9.5238%;
height: 100%;
position: absolute;
top: 0;
right: -9.5238%;
background: url('http://one-div.com/codepen/menu/menu-bg.png');
}
.rocket:before {
content: "";
width: 9.5238%;
height: 100%;
position: absolute;
top: 0;
left: -9.5238%;
background: url('http://one-div.com/codepen/menu/menu-bg.png');
border-radius: 5px 0px 0px 5px;
}
.earth:after{
  border-radius:0px 5px 5px 0px;
}
.current{
  position:absolute;
  top:-13px;
  left:8.92857%;
  margin-left: -49px;
  width:95px;
  height:165px;
  -webkit-transition: all 400ms cubic-bezier(.45,1.92,.9,1.54);
-moz-transition: all 400ms cubic-bezier(.45,1.92,.9,1.54);
-o-transition: all 400ms cubic-bezier(.45,1.92,.9,1.54);
-ms-transition: all 400ms cubic-bezier(.45,1.92,.9,1.54);
transition: all 400ms cubic-bezier(.16,1.23,.87,1.18);
}
.current-back{
  width:100%;
  height:100%;
  position:absolute;
  background:#c39449;
  border-radius:5px;
  border-bottom: 2px solid rgba(0, 0, 0, 0.09);
  border-top: 2px solid rgba(255,255,255,0.1);
}
.top-arrow{
  position:absolute;
  overflow:hidden;
  width:100%;
  height:12px;
  top:13px;
  left:0;
  z-index:2;
}
.top-arrow:before{
  content:"";
  position:absolute;
  width:80%;
  height:10px;
  top:-10px;
  left:10%;
  border-radius:20%;
  box-shadow:0 0 10px black;
}
.top-arrow:after{
  content:"";
  position:absolute;
  width:0;
  height:0;
  top:0px;
  border-top:8px solid #c39449;
  border-left:6px solid transparent;
  border-right:6px solid transparent;
  margin-left:-6px;
  left:50%;
}

.bottom-arrow{
  position:absolute;
  overflow:hidden;
  width:100%;
  height:12px;
  bottom:17px;
  left:0;
  z-index:2;
}
.bottom-arrow:before{
  content:"";
  position:absolute;
  width:80%;
  height:10px;
  bottom:-10px;
  left:10%;
  border-radius:20%;
  box-shadow:0 0 10px black;
}
.bottom-arrow:after{
  content:"";
  position:absolute;
  width:0;
  height:0;
  bottom:0;
  border-bottom:12px solid #c39449;
  border-left:8px solid transparent;
  border-right:8px solid transparent;
  margin-left:-8px;
  left:50%;
}

.wine:hover ~ .current{
  left: 25.5%;
}
.burger:hover ~ .current{
 left: 42%;
}
.comment:hover ~ .current{  
   left: 58.5%;
}
.sport:hover ~ .current{
  left: 75%;  
}
.earth:hover ~ .current{
  left: 91.1%; 
}
    </style>

  <script src="https://cdnjs.cloudflare.com/ajax/libs/prefixfree/1.0.7/prefixfree.min.js"></script>

</head>
    <body>
        <nav id="menu">
            
            
     <ul>
      <li class="rocket"><a href="user/showall.htm">User</a></li>
      <li class="wine"><a href="staff/showall.htm">Staff</a></li>
      <li class="burger"><a href="depart/showall.htm">Depart</a></li>
      <li class="comment"><a href="record/showall.htm">Record</a></li>
      <li class="sport" ><a href="">Top 10</a></li>
      <li class="earth"><a href="">Report</a></li>
      
  <div class="current">
    <div class="top-arrow"></div>   
    <div class="current-back"></div>
    <div class="bottom-arrow"></div>
  </div>
    </ul>
</nav>
  
    <script src="js/index1.js"></script>

    </body>
</html>
